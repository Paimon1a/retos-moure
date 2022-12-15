package com.jmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Reto3Test {
    Reto3 reto3 = new Reto3();

    @Test
    void primesTo100() {
        final String PRIMES = "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, " +
                "43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97";
        String primes = reto3.primes(100);
        Assertions.assertEquals(PRIMES, primes);

        new InfoTest(PRIMES, primes, "primesTo100").printIfCorrect();
    }
}