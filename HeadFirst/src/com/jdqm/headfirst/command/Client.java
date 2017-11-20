package com.jdqm.headfirst.command;

/**
 * Created by Jdqm on 2017-11-20.
 */
public class Client {
    public static void main(String... args) {
        Light light = new Light("客厅电灯");

        //将请求封装成一个命令对象
        LightOnCommand onCommand = new LightOnCommand(light);
        Invoker invoker = new Invoker();
        invoker.setCommand(onCommand);

        //在某个时候触发
        invoker.doExecute();

        //更换请求
        LightOffCommand offCommand = new LightOffCommand(light);
        invoker.setCommand(offCommand);
        invoker.doExecute();
    }
}
