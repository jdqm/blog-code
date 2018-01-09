package com.jdqm.headfirst.dediator;

/**
 * Created by Jdqm on 2018-1-9.
 */
public class Client {
    public static void main(String...args) {
        AbstractColleague concreteColleagueA = new ConcreteColleagueA();
        AbstractColleague concreteColleagueB = new ConcreteColleagueB();
        AbstractMediator mediator = new ConcreteMediator(concreteColleagueA, concreteColleagueA);
        concreteColleagueA.setNumber(1, mediator);
        System.out.println("A: " + concreteColleagueA.getNumber());
        System.out.println("B: " + concreteColleagueB.getNumber());

        concreteColleagueB.setNumber(100, mediator);
        System.out.println("A: " + concreteColleagueA.getNumber());
        System.out.println("B: " + concreteColleagueB.getNumber());
    }
}
