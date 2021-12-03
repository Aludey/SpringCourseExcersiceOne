package com.griddynamics;

public class GreeterWithConstructor {

    private String name;

    public GreeterWithConstructor() {
        this("World");
    }

    public GreeterWithConstructor(String name) {
        this.name = name;
    }

    public void greet(String name) {
        System.out.println(String.format("Hello %s!", name));
    }

    public void greet() {
        System.out.println(String.format("Hello %s!", this.name));
    }

    public void getId(){
        System.out.println(String.format("ID: %s", System.identityHashCode(this)));
    }
}
