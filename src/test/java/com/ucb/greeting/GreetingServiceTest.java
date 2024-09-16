package com.ucb.greeting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    @Test
    void getGreeting() {
        GreetingService greetingService = new GreetingService();
        assertEquals(
                "Pregúntante si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana\n",
                greetingService.getGreeting());
    }
}