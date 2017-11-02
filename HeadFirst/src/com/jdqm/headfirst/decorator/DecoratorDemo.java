package com.jdqm.headfirst.decorator;

/**
 * Created by Jdqm on 2017-11-2.
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Beverage beverage = new BlackCoffee();
        System.out.println(beverage.getDescription() + "," + beverage.cost());

        //使用Milk装饰类来装饰黑咖啡
        Beverage milkBeverage = new Milk(beverage);
        System.out.println(milkBeverage.getDescription() + "," + milkBeverage.cost());

    }
}
