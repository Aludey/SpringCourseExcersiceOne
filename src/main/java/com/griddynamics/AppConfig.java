package com.griddynamics;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean(name = "GreeterWithConstructor")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public GreeterWithConstructor createGreeterViaConstructor() {
        return new GreeterWithConstructor();
    }

    @Bean(name = "GreeterWithSetter")
    public GreeterWithSetter createGreeterViaSetter() {
        GreeterWithSetter greeter = new GreeterWithSetter();
        greeter.setName("Vlad");
        return greeter;
    }


    @Bean(name = "GreeterSingleton")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public GreeterSingleton createGreeterSingleton() {
        return GreeterSingleton.getInstance("Java Singleton");
    }

    @Bean(name = "GreeterWithFormatter")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public GreeterWithFormatter createGreeterWithFormatter() {
        return new GreeterWithFormatter();
    }

    @Bean(name = "GreetingFormatter")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public GreetingFormatter createGreetingFormatter() {
        return new PlainTextGreetingFormatter("Greetings ");
    }

    @Bean(name = "GreeterWithValues")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public GreeterWithValues createGreeterWithValues() {
        return new GreeterWithValues();
    }

}
