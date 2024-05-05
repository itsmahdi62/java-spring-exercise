package com.example.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In Constructor : "  + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @PostConstruct
    public void postconstruct(){
        System.out.println("hello post construce" + getClass());
    }
    @PreDestroy
    public void predestroy(){
        System.out.println("hello preddestroy" + getClass());
    }
}
