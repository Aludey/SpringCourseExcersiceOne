package com.griddynamics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationXMLContext = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext applicationJavaContext = new AnnotationConfigApplicationContext(AppConfig.class);

        GreeterWithConstructor greeterWithConstructor1 = applicationXMLContext.getBean("GreeterWithConstructor", GreeterWithConstructor.class);
        GreeterWithConstructor greeterWithConstructor2 = applicationXMLContext.getBean("GreeterWithConstructor", GreeterWithConstructor.class);

        GreeterWithSetter greeterWithSetter = applicationXMLContext.getBean("GreeterWithSetter", GreeterWithSetter.class);

        GreeterWithConstructor greeterWithConstructorJava = applicationJavaContext.getBean("GreeterWithConstructor", GreeterWithConstructor.class);
        GreeterWithSetter greeterWithSetterJava = applicationJavaContext.getBean("GreeterWithSetter", GreeterWithSetter.class);

        GreeterSingleton greeterSingleton = applicationXMLContext.getBean("GreeterSingleton", GreeterSingleton.class);
        GreeterSingleton greeterSingletonJava = applicationJavaContext.getBean("GreeterSingleton", GreeterSingleton.class);

        GreeterWithFormatter greeterWithFormatter = applicationJavaContext.getBean("GreeterWithFormatter", GreeterWithFormatter.class);

        GreeterWithValues greeterWithValues = applicationJavaContext.getBean("GreeterWithValues", GreeterWithValues.class);

        GreeterWithAfterProperties greeterWithAfterProperties = applicationXMLContext.getBean("GreeterWithAfterProperties", GreeterWithAfterProperties.class);

        greeterWithConstructor1.greet();
        greeterWithSetter.greet();

        greeterWithConstructorJava.greet();
        greeterWithSetterJava.greet();

        greeterWithConstructor1.getId();
        greeterWithConstructor2.getId();

        greeterSingleton.greet();
        greeterSingletonJava.greet();

        greeterWithFormatter.greet();

        greeterWithValues.greet();

        greeterWithAfterProperties.greet();
    }
}
