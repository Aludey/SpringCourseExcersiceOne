package com.griddynamics;

import org.springframework.beans.factory.annotation.Required;

public class GreeterWithSetter {

    private String name;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public void greet(String name) {
        System.out.println(String.format("Hello %s!", name));
    }

    public void greet() {
        System.out.println(String.format("Hello %s!", this.name));
    }
}
