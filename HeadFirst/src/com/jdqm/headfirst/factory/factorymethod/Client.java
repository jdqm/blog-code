package com.jdqm.headfirst.factory.factorymethod;


/**
 * Created by Jdqm on 2017-11-3.
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("出售了一个 " + pizza.getName());

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("greek");
        System.out.println("出售了一个 " + pizza.getName());
    }
}
