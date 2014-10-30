package com.springaction.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by nanagarajan on 9/23/2014.
 */

public class AutoWireByName {
    private int iCount;

    public int getCount() {
        return iCount;
    }

    public void setCount(int iCount) {
        this.iCount = iCount;
    }

}
