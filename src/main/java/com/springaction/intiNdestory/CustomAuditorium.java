package com.springaction.intiNdestory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by nanagarajan on 9/23/2014.
 */
public class CustomAuditorium implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Calling destory()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Calling After Properties set");
    }
}
