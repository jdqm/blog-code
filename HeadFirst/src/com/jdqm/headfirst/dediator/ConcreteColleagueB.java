package com.jdqm.headfirst.dediator;

/**
 * Created by Jdqm on 2018-1-9.
 */
public class ConcreteColleagueB extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator am) {
        super.setNumber(number);
        am.effectA();
    }
}
