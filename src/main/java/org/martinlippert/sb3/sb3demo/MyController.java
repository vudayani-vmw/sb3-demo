package org.martinlippert.sb3.sb3demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @GetMapping(value="/greeting")
    public String sayHello() {
        return "Hello World from Spring Boot 3";
    }    
    
}
