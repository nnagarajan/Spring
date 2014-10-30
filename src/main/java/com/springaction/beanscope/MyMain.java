package com.springaction.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedHashMap;

/**
 * Created by nanagarajan on 9/22/2014.
 */
public class MyMain {

    public static void main(String[] args) {

        LinkedHashMap hashMap=new LinkedHashMap();
        hashMap.put()

        //change scope prototype,singleton to see the difference
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");
        Ticket ticket1 = (Ticket) context.getBean("ticket");
        ticket1.setCount(22);
        System.out.println(ticket1.getCount());

        Ticket ticket2 = (Ticket) context.getBean("ticket");
        System.out.println(ticket2.getCount());

    }
}
