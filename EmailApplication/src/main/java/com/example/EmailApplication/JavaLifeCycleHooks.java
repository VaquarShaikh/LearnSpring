package com.example.EmailApplication;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JavaLifeCycleHooks {

    @PostConstruct
    public void init() {
        System.out.println("Inside init java lifecycle hooks ");
    }

    @PreDestroy

    public void destroy() {
        System.out.println("Inside destroy java lifecycle hooks ");
    }
}
