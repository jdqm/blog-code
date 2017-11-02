package com.jdqm.headfirst.decorator;

/**
 * Created by Jdqm on 2017-11-2.
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+Milk" ;
    }
}
