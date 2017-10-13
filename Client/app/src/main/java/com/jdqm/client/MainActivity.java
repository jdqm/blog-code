package com.jdqm.client;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.jdqm.downloadcenter.aidl.DownloadTask;
import com.jdqm.downloadcenter.aidl.IDownloadCenter;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    private Button btnAddTask;
    private Button btnGetTasks;

    private DownloadServiceConn serviceConn;
    private IDownloadCenter downloadCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        serviceConn = new DownloadServiceConn();
        Intent intent = new Intent("jdqm.intent.action.LAUNCH");
        intent.setPackage("com.jdqm.downloadcenter");
        bindService(intent, serviceConn, BIND_AUTO_CREATE);
    }

    private void initViews() {
        btnAddTask = findViewById(R.id.btnAddTask);
        btnGetTasks = findViewById(R.id.btnGetTasks);
        btnAddTask.setOnClickListener(this);
        btnGetTasks.setOnClickListener(this);
        btnAddTask.setEnabled(false);
        btnGetTasks.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAddTask:
                try {
                    Random random = new Random();
                    int id = random.nextInt(10);
                    DownloadTask task = new DownloadTask(id, "http://test.jdqm.com/test.aidl");

                    //在客户端直接调用IBinder接口的方法，最终服务端对应的方法得到调用，这似乎是在同一个进程中一般
                    //这是因为Binder机制已经把底层的实现隐藏掉了
                    downloadCenter.addDownloadTask(task);
                    Log.d(TAG, "添加任务成功: " + task);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.e(TAG, "添加任务失败");
                }
                break;
            case R.id.btnGetTasks:
                try {
                    List<DownloadTask> tasks = downloadCenter.getDownloadTask();
                    Log.d(TAG, "从服务中获取到已经添加的任务列表: " + tasks);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                break;
            default:
                break;
        }
    }

    private class DownloadServiceConn implements ServiceConnection {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d(TAG, "服务已连接" );
            Log.d(TAG, "ComponentName: " + name.getClassName()); //com.jdqm.downloadcenter.DownloadCenterService
            Log.d(TAG, "service: " + service.getClass().getName()); //android.os.BinderProxy
            //将绑定服务的返回的IBinder对象转换为目标接口类型
            downloadCenter = IDownloadCenter.Stub.asInterface(service);
            btnAddTask.setEnabled(true);
            btnGetTasks.setEnabled(true);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, "服务已断开");
            btnAddTask.setEnabled(false);
            btnGetTasks.setEnabled(false);
        }
    }

    @Override
    protected void onDestroy() {
        unbindService(serviceConn);
        super.onDestroy();
    }
}
