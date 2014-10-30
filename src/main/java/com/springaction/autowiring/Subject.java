package com.springaction.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nanagarajan on 9/23/2014.
 */
@Component
public class Subject {

    @Autowired
    private AutoWireByName autoWireByName;

    public AutoWireByName getAutoWireByName() {
        return autoWireByName;
    }

    public void setAutoWireByName(AutoWireByName autoWireByName) {
        this.autoWireByName = autoWireByName;
    }


}
