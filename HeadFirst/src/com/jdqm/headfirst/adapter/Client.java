package com.jdqm.headfirst.adapter;

/**
 * Created by Jdqm on 2017-11-20.
 */
public class Client {
    public static void main(String...args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();

        //类适配器
        Target2 target2 = new Adapter2();
        target2.request();
        target2.specificRequest();
    }
}
