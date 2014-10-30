package com.springaction.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nanagarajan on 9/23/2014.
 */
public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        Subject subject = (Subject) context.getBean("subject");
        System.out.println("Count :" + subject.getAutoWireByName());

    }
}
