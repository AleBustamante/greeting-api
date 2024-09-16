package com.ucb.greeting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GreetingService {
    private final String greetSpa;
    private final String greetEng;

    public GreetingService(
            @Value("${message.spa}") String greetSpa,
            @Value("${message.eng}") String greetEng
    ) {
        this.greetSpa = greetSpa;
        this.greetEng = greetEng;
    }
    public String getGreeting(
            String name,
            String lang
    ) {
        if (Objects.equals(lang, "eng")) {
            return String.format(greetEng, name);
        }
        else {
            return String.format(greetSpa, name);
        }
    }
}
