package com.jdqm.headfirst.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class WeatherData implements Subject{

    private Weather weather;

    private List<Observer> observers;

    public WeatherData(Weather weather) {
        observers = new ArrayList<>();
        this.weather = weather;
        this.observers = observers;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (observers != null) {
            for (Observer observer: observers) {
                observer.update(weather);
            }
        }
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        notifyObserver();
    }
}
