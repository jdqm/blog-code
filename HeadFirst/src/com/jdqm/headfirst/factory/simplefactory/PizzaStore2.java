package com.jdqm.headfirst.factory.simplefactory;

/**
 * Created by Jdqm on 2017-11-3.
 */
public class PizzaStore2 {
    private SimpleFactory simpleFactory;

    public PizzaStore2(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = simpleFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cute();
        pizza.box();
        return pizza;
    }
}
