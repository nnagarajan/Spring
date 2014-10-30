package com.springaction.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nanagarajan on 9/22/2014.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnquest();

    }
}
