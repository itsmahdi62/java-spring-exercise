package com.example.springboot.demo.mycoolapp.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;
    // expose "/" that return "Hello World";
    @GetMapping("/")
        public String sayHello(){
            return coachName;
        }

}
