package com.jdqm.headfirst.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class Display implements Observer {

    /**
     * notifyObservers()为pull的方式，notifyObservers(Object)是push的方式
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("arg:" + arg);
        if (o instanceof  WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            System.out.println(weatherData.getMsg());
        }
    }
}
