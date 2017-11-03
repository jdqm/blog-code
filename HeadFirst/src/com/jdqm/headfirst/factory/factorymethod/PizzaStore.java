package com.jdqm.headfirst.factory.factorymethod;

/**
 * Created by Jdqm on 2017-11-3.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cute();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
