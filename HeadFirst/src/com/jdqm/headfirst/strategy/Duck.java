package com.jdqm.headfirst.strategy;

/**
 * 策略模式：定义了算法族，分别封装起来，让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。
 * <p>
 * 原则：多用组合少用继承；有一个比是一个好（is a VS has a）,通过委托将变化的部分分离出去; 面向接口编程，而不是实现。
 * <p>
 * 技术：利用了Java的多态性。
 *
 * @author Jdqm on 2017-10-31.
 */
public abstract class Duck {

    /**
     * 面向接口编程而不是实现，利用多态性
     */
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void performFly() {
        //将具体的实现委托给算法族
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 不同的鸭子显示的方式不同
     */
    public abstract void display();

    public void swim() {
        System.out.println("鸭子游泳");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
