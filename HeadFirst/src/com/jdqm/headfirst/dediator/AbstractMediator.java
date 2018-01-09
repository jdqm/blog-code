package com.jdqm.headfirst.dediator;

/**
 * Created by Jdqm on 2018-1-9.
 */
public abstract class AbstractMediator {
    protected AbstractColleague colleagueA;
    protected AbstractColleague colleagueB;

    public AbstractMediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void effectA();
    public abstract void effectB();
}
