package com.luv2code.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "BOSH BOSH!";
    }

    @GetMapping("/workout")
    public String getDailyWorkOut(){
        return "Run a Hard 5k";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today Is Your Lucky Day"; 
    }
}
