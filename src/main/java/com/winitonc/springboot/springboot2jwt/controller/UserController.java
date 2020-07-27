package com.winitonc.springboot.springboot2jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping({"/hello"})
    public String helloPage() {
        return "Hello World";
    }

}
