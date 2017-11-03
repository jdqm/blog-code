package com.jdqm.headfirst.factory.simplefactory;

/**
 * Created by Jdqm on 2017-11-3.
 */
public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name = name + " Pizza";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name + " Pizza";
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("bake");
    }

    public void cute() {
        System.out.println("cute");
    }

    public void box() {
        System.out.println("cute");
    }
}
