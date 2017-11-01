package com.jdqm.headfirst.observer.jdk;

import java.util.Observable;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class WeatherData extends Observable {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
