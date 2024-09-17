package net.htlgkr.hausers22081.pos3.hue1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EratosthenesPrimeSieveTest {
    private static EratosthenesPrimeSieve primeSieve;

    @BeforeAll
    static void setUp() {
        primeSieve = new EratosthenesPrimeSieve(500);
    }

    @Test
    @DisplayName("isPrime with 5")
    void isPrime1() {
        Assertions.assertTrue(primeSieve.isPrime(5));
    }

    @Test
    @DisplayName("isPrime with 4")
    void isPrime2() {
        Assertions.assertFalse(primeSieve.isPrime(4));
    }

    @Test
    @DisplayName("isPrime with 1")
    void isPrime3() {
        Assertions.assertFalse(primeSieve.isPrime(1));
    }

    @Test
    @DisplayName("isPrime with 200")
    void isPrime() {
        Assertions.assertFalse(primeSieve.isPrime(200));
    }
}