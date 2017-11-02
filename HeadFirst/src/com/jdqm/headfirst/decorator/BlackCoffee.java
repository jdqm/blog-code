package com.jdqm.headfirst.decorator;

/**
 * Created by Jdqm on 2017-11-2.
 */
public class BlackCoffee extends Beverage {

    public BlackCoffee() {
        description = "BlackCoffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
