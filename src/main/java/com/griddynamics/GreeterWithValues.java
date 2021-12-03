package com.griddynamics;

import org.springframework.beans.factory.annotation.Value;


public class GreeterWithValues {

    @Value("${title.mr}. " + "${name.vlad}")
    private String name;

    public GreeterWithValues() {
    }

    public void greet(String name) {
        System.out.println(String.format("Hello %s!", name));
    }

    public void greet() {
        System.out.println(String.format("Hello %s!", this.name));
    }
}
