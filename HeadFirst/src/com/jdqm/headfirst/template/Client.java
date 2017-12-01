package com.jdqm.headfirst.template;

/**
 * Created by Jdqm on 2017-12-1.
 */
public class Client {

    public static void main(String...args) {
        CaffeineBeverage caffeineBeverage = new Tea();
        caffeineBeverage.prepareRecipe();
        caffeineBeverage = new Coffee();
        caffeineBeverage.prepareRecipe();
    }
}
