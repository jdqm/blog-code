package com.jdqm.headfirst.observer;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class ForecastDisplay implements Observer, DisplayElement {

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Weather weather) {
        System.out.println("天气预报更新了");
        display(weather);
    }

    @Override
    public void display(Weather weather) {
        System.out.println("显示天气预报：" + weather);
    }
}
