package com.springaction.factorymethod;

/**
 * Created by nanagarajan on 9/23/2014.
 */
public class FactoryBean {

    public static FactoryBean createFactoryBean() {
        return new FactoryBean();
    }

    public Integer createInteger() {
        return new Integer(15);
    }

    public Double createDouble() {
        return new Double(0.00);
    }
}
