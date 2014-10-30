package com.springaction.beanproperties;

import com.springaction.beanscope.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nanagarajan on 9/23/2014.
 */
public class Main {

    public static void main(String[] args) {

        //change scope prototype,singleton to see the difference
        ApplicationContext context = new ClassPathXmlApplicationContext("beanproperties.xml");
        Instrumentalist instrumentalist = (Instrumentalist) context.getBean("instrumentalist");
        instrumentalist.perform();

        Instrumentalist instrumentalistWithNameSpace = (Instrumentalist) context.getBean("instrumentalistWithNameSpace");
        instrumentalistWithNameSpace.perform();

    }
}
