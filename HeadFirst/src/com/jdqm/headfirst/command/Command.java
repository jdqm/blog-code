package com.jdqm.headfirst.command;

/**
 * Created by Jdqm on 2017-11-20.
 */
public interface Command {
    void execute();

    //支持撤销
    void undo();
}
