package com.rhd.springwebappexample.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource {
    
    @GetMapping("/")
    public String isWorking(){
        return "Pro meu Amigo Tenente!";
    }
}
