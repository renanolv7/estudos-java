package com.renan.primeiroTeste.testeSpring.controller;

import com.renan.primeiroTeste.testeSpring.domain.User;
import com.renan.primeiroTeste.testeSpring.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Renan");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
        return "Hello Word " + body.getName();
    }

}
