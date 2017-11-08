package com.jdqm.headfirst.singleton;

/**
 * Created by Jdqm on 2017-11-8.
 */
public class InnerClassSingleton {

    /**
     * 外部类加载了也不一定会加载内部类，也有 lazy loading的效果
     */
    private static class InnerClass {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    private InnerClassSingleton(){

    }

}
