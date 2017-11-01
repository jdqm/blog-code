package com.jdqm.headfirst.observer;

/**
 * Created by Jdqm on 2017-11-1.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void unRegisterObserver(Observer observer);
    void notifyObserver();
}
