package com.jmd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Reto4Test {
    @Test
    void calculateAreaWithLongSides6AndSides5(){
        Reto4 reto4 = new Reto4(6f, 5);
        final Double EXPECTED = 61.93718642120282D;

        double area = reto4.calculateArea();

        assertEquals(EXPECTED, area);

        new InfoTest(EXPECTED, area, "calculateAreaWithLongSides6AndSides5").printIfCorrect();
    }
}