package com.jdqm.headfirst.observer;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    public CurrentConditionDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Weather weather) {
        System.out.println("天气信息更新了");
        display(weather);
    }

    @Override
    public void display(Weather weather) {
        System.out.println("显示当前天气情况:" + weather);
    }
}
