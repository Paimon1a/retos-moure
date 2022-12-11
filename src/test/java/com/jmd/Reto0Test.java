package com.jmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Reto0Test {

    @Test
    void fizzbuzzRepeat5() {
//        cof
        Reto0 reto0 = new Reto0();
        StringBuilder res = new StringBuilder();
        final String EXPECTED = """
                fizz
                buzz
                """;

//        exe
        for (int i = 0; i < 5; i++) {
            res.append(reto0.fizzbuzz(i + 1));
        }

//        assert
        Assertions.assertEquals(EXPECTED, res.toString());

        printIfCorrect(new InfoTest(EXPECTED, res, "fizzbuzzRepeat5"));
    }

    @Test
    void fizzbuzzRepeat15() {
//        cof
        Reto0 reto0 = new Reto0();
        StringBuilder res = new StringBuilder();
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
        for (int i = 0; i < 15; i++) {
            res.append(reto0.fizzbuzz(i + 1));
        }

//        assert
        Assertions.assertEquals(EXPECTED, res.toString());

        printIfCorrect(new InfoTest(EXPECTED, res, "fizzbuzzRepeat15"));
    }

    @Test
    void fizzbuzzRepeat100() {
//        cof
        Reto0 reto0 = new Reto0();
        StringBuilder res = new StringBuilder();
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
        for (int i = 0; i < 100; i++) {
            res.append(reto0.fizzbuzz(i + 1));
        }

//        assert
        Assertions.assertEquals(EXPECTED, res.toString());

        printIfCorrect(new InfoTest(EXPECTED, res, "fizzbuzzRepeat100"));
    }

    private void printIfCorrect(InfoTest infoTest) {
        if (infoTest.actual.toString().equals(infoTest.expected)) {
            System.out.println(infoTest.nameMethodTest + ":\n" + infoTest.actual.toString());
        }
    }
}

class InfoTest {
    Object expected;
    Object actual;
    String nameMethodTest;

    public InfoTest(Object expected, Object actual, String nameMethodTest) {
        this.expected = expected;
        this.actual = actual;
        this.nameMethodTest = nameMethodTest + "()";
    }
}