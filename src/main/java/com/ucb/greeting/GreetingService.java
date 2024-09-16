package com.ucb.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final String greet;

    public GreetingService(@Value("${message}") String greet) {
        this.greet = greet;
    }
    public String getGreeting() {
        return greet;
    }
}
