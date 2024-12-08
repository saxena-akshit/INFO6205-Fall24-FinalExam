package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void Zero() {
        assertEquals(0, Fibonacci.getN(0));
    }

    @Test
    void One() {
        assertEquals(1, Fibonacci.getN(1));
    }

    @Test
    void Two() {
        assertEquals(1, Fibonacci.getN(2));
    }

    @Test
    void Twenty() {
        assertEquals(6765, Fibonacci.getN(20));
    }

    @Test
    void isMemoized() {
        assertEquals(12586269025L, Fibonacci.getN(50));
    }

    @Test
    void isMemoized2() {
        assertEquals(7540113804746346429L, Fibonacci.getN(92));
    }
}