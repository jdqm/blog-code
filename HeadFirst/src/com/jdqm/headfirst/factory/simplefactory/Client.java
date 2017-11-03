package com.jdqm.headfirst.factory.simplefactory;

/**
 * Created by Jdqm on 2017-11-3.
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("出售了一个 " + pizza.getName());

        //使用简单工厂来分离出变化的部分，单独放到一个类中
        SimpleFactory factory = new SimpleFactory();
        PizzaStore2 pizzaStore2 = new PizzaStore2(factory);
        Pizza pizza2 = pizzaStore2.orderPizza("greek");
        System.out.println("出售了一个 " + pizza2.getName());
    }
}
