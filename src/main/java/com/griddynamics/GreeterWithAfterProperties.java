package com.griddynamics;


import org.springframework.beans.factory.InitializingBean;

public class GreeterWithAfterProperties implements InitializingBean {

    private String title;
    private String name;
    private String fullname;

    @Override
    public void afterPropertiesSet() throws Exception {
        fullname = title + ". " + name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet(String fullname) {
        System.out.println(String.format("Hello %s!", fullname));
    }

    public void greet() {
        System.out.println(String.format("Hello %s!", this.fullname ));
    }
}
