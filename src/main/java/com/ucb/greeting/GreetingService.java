package com.ucb.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    String greet = "Pregúntante si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana\n";

    public String getGreeting() {
        return greet;
    }
}
