package com.jdqm.headfirst.command;

/**
 * Created by Jdqm on 2017-11-20.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doExecute() {
        command.execute();
    }
}
