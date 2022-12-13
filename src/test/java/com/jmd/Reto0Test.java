package com.jmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Reto0Test {
    Reto0 reto0 = new Reto0();

    @Test
    void fizzbuzzRepeat5() {
//        cof
        final String EXPECTED = """
                fizz
                buzz
                """;
        final int REPETITIONS = 5;

//        exe
        String res = repeatFizzBuzz(REPETITIONS);

//        assert
        Assertions.assertEquals(EXPECTED, res);

        new InfoTest(EXPECTED, res, "fizzbuzzRepeat5").printIfCorrect();
    }

    @Test
    void fizzbuzzRepeat15() {
//        cof
        final int REPETITIONS = 15;
        final String EXPECTED = """
                fizz
                buzz
                fizz
                fizz
                buzz
                fizz
                fizzbuzz
                """;

//        exe
        String res = repeatFizzBuzz(REPETITIONS);

//        assert
        Assertions.assertEquals(EXPECTED, res);

        new InfoTest(EXPECTED, res, "fizzbuzzRepeat15").printIfCorrect();
    }

    @Test
    void fizzbuzzRepeat100() {
//        cof
        final int REPETITIONS = 100;
        final String EXPECTED = """
                fizz
                buzz
                fizz
                fizz
                buzz
                fizz
                fizzbuzz
                fizz
                buzz
                fizz
                fizz
                buzz
                fizz
                fizzbuzz
                fizz
                buzz
                fizz
                fizz
                buzz
                fizz
                fizzbuzz
                fizz
                buzz
                fizz
                fizz
                buzz
                fizz
                fizzbuzz
                fizz
                buzz
                fizz
                fizz
                buzz
                fizz
                fizzbuzz
                fizz
                buzz
                fizz
                fizz
                buzz
                fizz
                fizzbuzz
                fizz
                buzz
                fizz
                fizz
                buzz
                """;

//        exe
        String res = repeatFizzBuzz(REPETITIONS);

//        assert
        Assertions.assertEquals(EXPECTED, res);

        new InfoTest(EXPECTED, res, "fizzbuzzRepeat100").printIfCorrect();
    }

    private String repeatFizzBuzz(int repeat) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            res.append(reto0.fizzbuzz(i + 1).isEmpty() ? "" : "%s\n".formatted(reto0.fizzbuzz(i + 1)));
        }
        return res.toString();
    }
}