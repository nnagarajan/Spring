package com.springaction.factorymethod;

/**
 * Created by nanagarajan on 9/22/2014.
 */
public class FactoryMethod {
    private FactoryMethod() {
    }

    private static class StageSingletonHolder {
        static FactoryMethod instance = new FactoryMethod();
    }

    public static FactoryMethod getInstance() {
        return StageSingletonHolder.instance;
    }

    public void action() {
        System.out.println("My Action");
    }

}
