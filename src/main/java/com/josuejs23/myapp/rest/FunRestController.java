package com.josuejs23.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    public String coachName;

    @Value("${team.name}")
    public String teamName;

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/teaminfo")
    public String teamInfo(){
        return "The team %s has the coach %s".formatted(teamName, coachName);
    }
}
