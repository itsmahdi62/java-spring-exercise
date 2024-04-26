package com.firstSpring.demo.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    //expose a new endpoint
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }
}
