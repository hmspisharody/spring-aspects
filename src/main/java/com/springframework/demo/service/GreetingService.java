package com.springframework.demo.service;

import com.springframework.demo.aspect.Countable;
import com.springframework.demo.aspect.Loggable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class GreetingService {

    @Value("${app.greeting}")
    private String greeting;

    public GreetingService() {
        super();
    }

    @Loggable
    //@Countable
    public String getGreeting(String name) {
        return greeting + " " + name;
    }

    @PostConstruct
    public void init() {
        System.out.println("------  POST CONSTRUCT was called here  ---------");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("-------- GreetingService BEAN will be desroyed after this ---------");
    }

}
