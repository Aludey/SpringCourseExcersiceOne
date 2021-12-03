package com.griddynamics;

import org.springframework.beans.factory.annotation.Autowired;

public class GreeterWithFormatter {

    @Autowired
    private GreetingFormatter formatter;
    private String name;

    public GreeterWithFormatter() {
        this.name = "Formatter";
    }

    public GreeterWithFormatter(String name) {
        this.name = name;
    }

    public void greet(String name) {
        System.out.println(formatter.format(name));
    }

    public void greet() {
        System.out.println(formatter.format(this.name));
    }

    public void getId(){
        System.out.println(String.format("ID: %s", System.identityHashCode(this)));
    }
}
