package com.jmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Reto0Test {

    @Test
    void fizzbuzzRepeat5() {
//        cof
        Reto0 reto0 = new Reto0();
        StringBuilder res = new StringBuilder();

//        exe
        for (int i = 0; i < 5; i++) {
            res.append(reto0.fizzbuzz(i + 1));
        }

//        assert
        Assertions.assertEquals("fizz\nbuzz\n", res.toString());
    }

    @Test
    void fizzbuzzRepeat15() {
//        cof
        Reto0 reto0 = new Reto0();
        StringBuilder res = new StringBuilder();

//        exe
        for (int i = 0; i < 15; i++) {
            res.append(reto0.fizzbuzz(i + 1));
        }

//        assert
        Assertions.assertEquals("fizz\nbuzz\nfizz\nfizz\nbuzz\nfizz\nfizzbuzz\n", res.toString());
    }
}