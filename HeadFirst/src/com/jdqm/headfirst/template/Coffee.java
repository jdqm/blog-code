package com.jdqm.headfirst.template;

/**
 * Created by Jdqm on 2017-12-1.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("冲咖啡");
    }

    @Override
    public void addCondiment() {
        System.out.println("加糖");
    }
}
