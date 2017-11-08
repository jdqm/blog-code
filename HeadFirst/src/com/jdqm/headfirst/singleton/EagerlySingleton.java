package com.jdqm.headfirst.singleton;

/**
 * 饿汉试单例模式
 *
 * 在虚拟机层面实现同步，问题就是一旦类加载就会实例化
 *
 * Created by Jdqm on 2017-11-8.
 */
public class EagerlySingleton {

    private static EagerlySingleton instance = new EagerlySingleton();

    private EagerlySingleton() {

    }

    public static EagerlySingleton getInstance() {
        return instance;
    }
}
