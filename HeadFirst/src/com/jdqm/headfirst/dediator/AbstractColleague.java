package com.jdqm.headfirst.dediator;

/**
 * Created by Jdqm on 2018-1-9.
 */
public abstract class AbstractColleague {
    private int number = 1;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
    }
}
