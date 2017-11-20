package com.jdqm.headfirst.adapter;

/**
 * 类适配器
 * Created by Jdqm on 2017-11-20.
 */
public class Adapter2 extends Adaptee implements Target2{

    @Override
    public void request() {
        System.out.println("request");
    }
}
