package com.jdqm.headfirst.observer;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {

    public ThirdPartyDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Weather weather) {
        System.out.println("第三方显示板接收到天气变化通知");
        display(weather);
    }

    @Override
    public void display(Weather weather) {
        System.out.println("第三方显示板显示天气情况");
    }
}
