package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @Timeout(value = 1)
    void Zero() {
        assertEquals(0, Fibonacci.getN(0));
    }

    @Test
    @Timeout(value = 1)
    void One() {
        assertEquals(1, Fibonacci.getN(1));
    }

    @Test
    @Timeout(value = 1)
    void Two() {
        assertEquals(1, Fibonacci.getN(2));
    }

    @Test
    @Timeout(value = 1)
    void Twenty() {
        assertEquals(6765, Fibonacci.getN(20));
    }

    @Test
    @Timeout(value = 1)
    void isMemoized() {
        assertEquals(12586269025L, Fibonacci.getN(50));
    }

    @Test()
    @Timeout(value = 1)
    void isMemoized2() {
        assertEquals(7540113804746346429L, Fibonacci.getN(92));
    }
}