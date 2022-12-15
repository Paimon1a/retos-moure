package com.jmd;

public class InfoTest {
    Object expected;
    Object actual;
    String nameMethodTest;

    public InfoTest(Object expected, Object actual, String nameMethodTest) {
        this.expected = expected;
        this.actual = actual;
        this.nameMethodTest = nameMethodTest + "()";
    }

    public void printIfCorrect() {
        if (actual.toString().equals(expected.toString())) {
            System.out.println(nameMethodTest + ":\n" + actual.toString() + "\n");
        }
    }
}
