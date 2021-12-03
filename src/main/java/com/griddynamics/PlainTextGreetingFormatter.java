package com.griddynamics;

import org.springframework.stereotype.Component;

@Component("Formatter")
public class PlainTextGreetingFormatter implements GreetingFormatter{

    String greeting;

    public PlainTextGreetingFormatter(String greeting){
        this.greeting = greeting;
    }

    @Override
    public String format(String name) {
        return greeting + name + '!';
    }
}
