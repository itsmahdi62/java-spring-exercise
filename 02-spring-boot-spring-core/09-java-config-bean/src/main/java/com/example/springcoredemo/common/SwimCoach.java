package com.example.springcoredemo.common;

public class SwimCoach  implements Coach{

    public SwimCoach(){
        System.out.println("in constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters";
    }
}
