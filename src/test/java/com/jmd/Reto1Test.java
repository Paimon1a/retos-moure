package com.jmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Reto1Test {
    Reto1 reto1 = new Reto1();

    @Test
    void isAnagramTrue() {
//        conf
        final String WORD1 = "NULL";
        final String WORD2 = "LLUN";

//        exe
        boolean isAnagram = reto1.isAnagram(WORD1, WORD2);

//        assert
        Assertions.assertTrue(isAnagram);

        new InfoTest(true, isAnagram, "isAnagramTrue").printIfCorrect();
    }

    @Test
    void isAnagramFalse() {
//        conf
        final String WORD1 = "NULL";
        final String WORD2 = "HOLA";

//        exe
        boolean isAnagram = reto1.isAnagram(WORD1, WORD2);

//        assert
        Assertions.assertFalse(isAnagram);

        new InfoTest(false, isAnagram, "isAnagramFalse").printIfCorrect();
    }
}