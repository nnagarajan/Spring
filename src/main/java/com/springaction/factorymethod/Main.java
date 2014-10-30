package com.springaction.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nanagarajan on 9/22/2014.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
        FactoryMethod factoryMethod = (FactoryMethod) context.getBean("factoryMethod");
        factoryMethod.action();

        Integer integer = (Integer) context.getBean("myInteger");
        Double dbl = (Double) context.getBean("myDouble");

        System.out.println(integer);
        System.out.println(dbl);

    }
}
