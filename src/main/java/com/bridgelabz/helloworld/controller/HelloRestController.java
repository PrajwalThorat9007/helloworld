package com.bridgelabz.helloworld.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import com.bridgelabz.helloworld.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/hello")

public class HelloRestController {

    private static final Logger log =
            LoggerFactory.getLogger(HelloRestController.class);

    // 1 simple
    @GetMapping
    public String sayHello() {

        log.info("Hello API called");

        return "Hello from BridgeLabz";
    }

    // 2 query param
    // /hello/query?name=Prajwal
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name;
    }

    // 3 path variable
    // /hello/Prajwal
    @GetMapping("/{name}")
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name;
    }

    // 4 post body
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }

}