package com.jdqm.headfirst.strategy;

/**
 * Created by Jdqm on 2017-10-31.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是一个不会飞的鸭子");
    }
}
