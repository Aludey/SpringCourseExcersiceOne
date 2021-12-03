package com.griddynamics;

public class GreeterSingleton {
    private static GreeterSingleton instance;
    public String name;

    private GreeterSingleton(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.name = name;
    }

    public static GreeterSingleton getInstance(String name) {
        if (instance == null) {
            instance = new GreeterSingleton(name);
        }
        return instance;
    }

    public void greet(String name) {
        System.out.println(String.format("Hello %s!", name));
    }

    public void greet() {
        System.out.println(String.format("Hello %s!", this.name));
    }
}
