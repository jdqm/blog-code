package com.jdqm.downloadcenter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.jdqm.downloadcenter.aidl.DownloadTask;
import com.jdqm.downloadcenter.aidl.IDownloadCenter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jdqm on 2017-10-12.
 */

public class DownloadCenterService extends Service {

    private List<DownloadTask> tasks;

    private DownloadCenter downloadCenter;

    @Override
    public void onCreate() {
        super.onCreate();

        //由于是在Binder线程池中访问这个集合，所以有必要好线程同步。除非你能确保并发情况下不会出现问题
        tasks = Collections.synchronizedList(new ArrayList<DownloadTask>());
        downloadCenter = new DownloadCenter();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return downloadCenter;
    }

    /**
     * 完成aidl文件编写后，下次Build时Android SDK tools会根据IDownloadCenter.aidl文件生成
     * IDownloadCenter.java文件，Stub是它的内部类
     */
    private class DownloadCenter extends IDownloadCenter.Stub {

        @Override
        public void addDownloadTask(DownloadTask task) throws RemoteException {
            tasks.add(task);
        }


        @Override
        public List<DownloadTask> getDownloadTask() throws RemoteException {
            return tasks;
        }
    }
}
