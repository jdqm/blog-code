package com.jdqm.headfirst.strategy;

/**
 * 典型的应用例子：
 * 1、决斗类游戏里面切换武器。
 * 2、一个菜单功能能够根据用户的“皮肤”首选项来决定是否采用水平的还是垂直的排列形式。同时可以灵活增加菜单那的显示样式。
 * 3、出行旅游：我们可以有几个策略可以考虑：可以骑自行车，汽车，做火车，飞机。每个策略都可以得到相同的结果，但是它们使用了不同的资源。
 *    选择策略的依据是费用，时间，使用工具还有每种方式的方便程度。
 *
 * 参考资料：http://blog.csdn.net/hguisu/article/details/7558249/
 *
 * Created by Jdqm on 2017-10-31.
 */
public class TestDemo {
    public static void main(String...args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();

        //改变算法，但是使用的客户不需要改变
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();
    }
}
