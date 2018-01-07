// IDownloadCenter.aidl
package com.jdqm.downloadcenter.aidl;

import com.jdqm.downloadcenter.aidl.DownloadTask;

interface IDownloadCenter {
    //添加下载任务
    void addDownloadTask(out DownloadTask task);

    //查询所有的添加的下载任务
    List<DownloadTask> getDownloadTask();
}
