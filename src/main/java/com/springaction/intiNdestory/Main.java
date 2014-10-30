package com.springaction.intiNdestory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nanagarajan on 9/22/2014.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("initNDestroy.xml");
        Auditorium auditorium1 = (Auditorium) context.getBean("auditorium");
        Auditorium auditorium2 = (Auditorium) context.getBean("auditorium");


        CustomAuditorium customAuditorium = (CustomAuditorium) context.getBean("customAuditorium");

        ApplicationContext context1 = new ClassPathXmlApplicationContext("defaultInitNDdestory.xml");

        context.getBean("auditorium");


    }
}
