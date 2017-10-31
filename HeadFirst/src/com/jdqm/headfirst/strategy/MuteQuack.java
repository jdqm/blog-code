package com.jdqm.headfirst.strategy;

/**
 * Created by Jdqm on 2017-10-31.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会呱呱叫");
    }
}
