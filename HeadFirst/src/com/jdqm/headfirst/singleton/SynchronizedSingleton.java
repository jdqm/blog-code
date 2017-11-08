package com.jdqm.headfirst.singleton;

/**
 * 懒汉式单例模式，同步方法
 * <p>
 * 特点：构造函数私有化，一个静态实例，一个全局访问点
 * <p>
 * 这种写法有一个缺点就是每次调用getInstance()方法都会进行同步操作，
 * 其实99%的情况都是不需要同步的，只要instance实例化完毕一次，后面的都不再需要同步了
 * <p>
 * Created by Jdqm on 2017-11-8.
 */
public class SynchronizedSingleton {
    private static volatile SynchronizedSingleton instance;

    private SynchronizedSingleton() {

    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
