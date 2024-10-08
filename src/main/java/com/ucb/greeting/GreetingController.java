package com.ucb.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String greeting(
            @RequestParam(name = "name", defaultValue = "Amigo") String name,
            @RequestParam(name = "lang", defaultValue = "spa") String lang
    ) {
        return greetingService.getGreeting(name, lang);
    }
}
