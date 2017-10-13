package com.jdqm.downloadcenter.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Jdqm on 2017-10-12.
 */

public class DownloadTask implements Parcelable{

    private int id;

    private String url;

    public DownloadTask() {
    }

    public DownloadTask(int id, String url) {
        this.id = id;
        this.url = url;
    }

    protected DownloadTask(Parcel in) {
        id = in.readInt();
        url = in.readString();
    }

    public static final Creator<DownloadTask> CREATOR = new Creator<DownloadTask>() {
        @Override
        public DownloadTask createFromParcel(Parcel in) {
            return new DownloadTask(in);
        }

        @Override
        public DownloadTask[] newArray(int size) {
            return new DownloadTask[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(url);
    }

    public void readFromParcel(Parcel in) {
        id = in.readInt();
        url = in.readString();
    }
    //重写toString方法方便打印
    @Override
    public String toString() {
        return "DownloadTask{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
