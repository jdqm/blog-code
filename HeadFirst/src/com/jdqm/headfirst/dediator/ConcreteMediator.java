package com.jdqm.headfirst.dediator;

/**
 * Created by Jdqm on 2018-1-9.
 */
public class ConcreteMediator extends AbstractMediator {
    public ConcreteMediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
        super(colleagueA, colleagueB);
    }

    @Override
    public void effectA() {
        colleagueA.setNumber(colleagueB.getNumber() / 100);
    }

    @Override
    public void effectB() {
        colleagueA.setNumber(colleagueA.getNumber() * 100);
    }
}
