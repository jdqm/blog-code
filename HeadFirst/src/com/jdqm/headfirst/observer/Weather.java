package com.jdqm.headfirst.observer;

/**
 * Created by Jdqm on 2017-11-1.
 */
public class Weather {
    private float temperature;
    private  float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
