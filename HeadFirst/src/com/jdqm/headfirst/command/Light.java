package com.jdqm.headfirst.command;

/**
 * Created by Jdqm on 2017-11-20.
 */
public class Light {
    private String desc;

    public Light(String desc) {
        this.desc = desc;
    }

    public void on() {
        System.out.println(desc + " is on.");
    }

    public void off() {
        System.out.println(desc + " is off.");
    }
}
