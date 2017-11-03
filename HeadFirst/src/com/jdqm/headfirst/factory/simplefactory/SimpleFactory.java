package com.jdqm.headfirst.factory.simplefactory;

/**
 *
 * 只要有产品变动，只需要就要修改这个类即可
 *
 * Created by Jdqm on 2017-11-3.
 */
public class SimpleFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(type);
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza(type);
        }
        return pizza;
    }
}
