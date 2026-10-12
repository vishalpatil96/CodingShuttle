package com.springbootLecture.springbootLecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome()
    {
        System.out.println("Hey bro!!");
        return "added changes";

    }
}
