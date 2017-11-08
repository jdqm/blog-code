package com.jdqm.headfirst.singleton;

/**
 * 懒汉式单例模式
 *
 * 特点：构造函数私有化，一个静态实例，一个全局访问点
 *
 * jdk 1.5以上double-check机制才成立
 *
 * Created by Jdqm on 2017-11-8.
 */
public class LazySingleton {
    private  static volatile LazySingleton instance;

    private LazySingleton() {

    }

    /**
     * 解决同步问题，为了提高性能使用double-check，只有第一次需要同步
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized(LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
