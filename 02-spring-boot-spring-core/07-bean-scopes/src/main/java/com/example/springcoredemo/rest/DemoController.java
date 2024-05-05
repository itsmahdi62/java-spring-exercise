package com.example.springcoredemo.rest;

import com.example.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach ;
    @Autowired
    public void DemoController(@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach){
        myCoach = theCoach;
        anotherCoach = theAnotherCoach ;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @getMapping("/check")
    public String check(){
        return "Comparing beans : myCoach == anotherCoach , " + (myCoach == anotherCoach);
    }

}
