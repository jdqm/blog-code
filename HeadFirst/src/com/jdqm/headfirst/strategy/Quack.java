package com.jdqm.headfirst.strategy;

/**
 * Created by Jdqm on 2017-10-31.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
