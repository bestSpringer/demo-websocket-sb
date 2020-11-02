package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/boot")
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello boot";
    }
}
