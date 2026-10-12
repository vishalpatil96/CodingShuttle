package com.springbootLecture.springbootLecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to Springboot world";

    }
}
