package com.example.springbootapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping(value={"/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!";
    }

    @GetMapping(value = {"/query"})
    public String sayHelloParam1 (@RequestParam(value="name")String name) {
        return "Hello " + name + "!";
    }

    @GetMapping ("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+ name+ "!";
    }
}
