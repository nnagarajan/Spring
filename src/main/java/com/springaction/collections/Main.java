package com.springaction.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nanagarajan on 9/23/2014.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
        WireAList wireAList = (WireAList) context.getBean("wirealist");
        for (Object l : wireAList.getListCollection()) {
            System.out.println(l.toString());
        }


        WireAMap wireAMap = (WireAMap) context.getBean("wireamap");

        for (Object o : wireAMap.getMap().keySet()) {
            System.out.println(o.toString());
        }

        WireAProp wireAProp = (WireAProp) context.getBean("wireaprop");

        for (Object o : wireAProp.getProperties().keySet()) {
            System.out.println(o.toString());
        }


    }
}
