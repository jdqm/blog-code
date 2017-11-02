package com.jdqm.headfirst.decorator;

/**
 * 装饰者模式：动态地将责任添加到对象上。若要扩展功能，装饰者提供了比继承更具有弹性的替代方案。
 *
 * Created by Jdqm on 2017-11-2.
 */
public abstract class Beverage {
    protected String description;

    public abstract double cost();
    public abstract String getDescription();
}
