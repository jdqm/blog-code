package com.jdqm.headfirst.factory.simplefactory;

/**
 * Created by Jdqm on 2017-11-3.
 */
public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        //只要有产品变动，就要修改，这就是变化的部分，分离到一个单独的类中，即工厂类
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(type);
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza(type);
        }
        pizza.prepare();
        pizza.bake();
        pizza.cute();
        pizza.box();
        return pizza;
    }
}
