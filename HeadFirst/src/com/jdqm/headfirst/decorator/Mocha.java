package com.jdqm.headfirst.decorator;

/**
 * Created by Jdqm on 2017-11-2.
 */
public class Mocha extends Beverage {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+Mocha";
    }
}
