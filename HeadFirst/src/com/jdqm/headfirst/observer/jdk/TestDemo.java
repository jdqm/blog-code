package com.jdqm.headfirst.observer.jdk;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class TestDemo {

    public static void main(String...args) {
        WeatherData weatherData = new WeatherData();
        Display d = new Display();
        weatherData.addObserver(d);
        weatherData.setMsg("新通知来了");

        //这种是pull方式，观察者可以根据自己的情况来拉去需要的信息，避免交互一些无用的数据
        weatherData.setChanged();
        weatherData.notifyObservers();

        weatherData.setChanged();
        weatherData.notifyObservers("push通知给观察者，全部接收");
    }
}
