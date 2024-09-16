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
    public void testGetGreetingInSpanish() {
        String expectedGreeting = "Pepe, preguntante si lo que estas haciendo hoy te acerca al lugar en el que quieres estar manana\n";
        assertEquals(expectedGreeting, greetingService.getGreeting("Pepe", "spa"));
    }

    @Test
    public void testGetGreetingInEnglish() {
        String expectedGreeting = "John, ask yourself if what you're doing today gets you closer to the place you want to be tomorrow\n";
        assertEquals(expectedGreeting, greetingService.getGreeting("John", "eng"));
    }
}