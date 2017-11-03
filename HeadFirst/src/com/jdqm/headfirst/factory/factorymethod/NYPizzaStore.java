package com.jdqm.headfirst.factory.factorymethod;

/**
 * Created by Jdqm on 2017-11-3.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new NYCheesePizza(type);
        } else if ("greek".equals(type)) {
            pizza = new NYGreekPizza(type);
        }
        return pizza;
    }
}
