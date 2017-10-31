package com.jdqm.headfirst.strategy;

/**
 * Created by Jdqm on 2017-10-31.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是一个有翅膀的鸭子，我会飞");
    }
}
