package com.jdqm.headfirst.template;

/**
 * Created by Jdqm on 2017-12-1.
 *
 * desc: 模板方法模式
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    final void boilWater() {
        System.out.println("烧开水");
    }

    final void pourInCup() {
        System.out.println("将饮料倒进杯子");
    }

    public abstract void brew();
    public abstract void addCondiment();
}
