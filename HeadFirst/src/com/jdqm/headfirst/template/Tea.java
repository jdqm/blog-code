package com.jdqm.headfirst.template;

/**
 * Created by Jdqm on 2017-12-1.
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("泡茶");
    }

    @Override
    public void addCondiment() {
        System.out.println("加柠檬");
    }
}
