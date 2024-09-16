package com.ucb.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class GreetingServiceTest {
    @Autowired
    private GreetingService greetingService;


    @Test
    void getGreeting() {
        assertEquals(
                "Preguntante si lo que estas haciendo hoy te acerca al lugar en el que quieres estar manana\n",
                greetingService.getGreeting());
    }
}