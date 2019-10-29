package com.company;

import org.jetbrains.annotations.Contract;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testToString() {
    }

    @Test
    public void testTwoPositiveNumbers() {
        int result = Numbers.sum(3, 5);
        assertEquals(result, 8);
    }

    @Test
    void testIfItAcceptsTwoNegativeNumbers() {
        int negResult = Numbers.sum(-2, -3);
        assertEquals(negResult, -5);
    }

    @Test
    void testIfNumberIsPositive() {
        boolean check;
        if (Numbers.positive(3)) check = true;
        else check = false;
        //assertTrue(check);
       // assertFalse(check);

    }
}
