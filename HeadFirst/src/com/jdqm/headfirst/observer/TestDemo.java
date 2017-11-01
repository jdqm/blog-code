package com.jdqm.headfirst.observer;

/**
 * 观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象转态改变了，它的所有依赖者都会收到通知并自动更新。为交互对象之间的松散耦合而设计；
 * 设计原则：针对接口编程，而不是针对实现编程；找出程序中变化的部分，让其和不变的部分分离；多用组合，少用继承；
 *
 * 优点：交互的对象（观察者和被观察者）松耦合，双方都依赖于抽象接口，从而使得各自的变换都不会影响另一边的变换。
 *
 * 缺点：①在应用观察者模式时需要考虑一下开发效率和运行效率的问题，程序中包括一个被观察者、多个观察者，开发、调试等内容会比较复杂，
 *      ②在Java中消息的通知一般是顺序执行，那么一个观察者阻塞，会影响整体的执行效率，在这种情况下，一般会采用异步实现。
 *      ③使用push的方式通知，有可能交互了一些无用的数据，所以最好提供pull的方式，就像Java内置的Observer
 *
 * Created by Jdqm on 2017-11-1.
 */
public class TestDemo {

    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.setTemperature(25);
        weather.setHumidity(90);
        weather.setPressure(100);

        WeatherData weatherData = new WeatherData(weather);
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
        ForecastDisplay fd = new ForecastDisplay(weatherData);
        //第三方显示板可以实现轻松插拔
        ThirdPartyDisplay td = new ThirdPartyDisplay(weatherData);
        weatherData.notifyObserver();

        //天气变化
        weather.setTemperature(30);
        weatherData.setWeather(weather);

        //拔掉第三方显示板
        weatherData.unRegisterObserver(td);

        //天气变化
        weather.setTemperature(35);
        weatherData.setWeather(weather);

    }
}
