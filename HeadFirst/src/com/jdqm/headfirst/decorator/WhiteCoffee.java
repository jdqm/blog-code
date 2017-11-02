package com.jdqm.headfirst.decorator;

/**
 * 具体的饮料：白咖啡
 *
 * Created by Jdqm on 2017-11-2.
 */
public class WhiteCoffee  extends Beverage{

    public WhiteCoffee() {
        description = "WhiteCoffee";
    }

    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
