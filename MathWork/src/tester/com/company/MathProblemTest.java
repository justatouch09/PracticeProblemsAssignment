package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jaradtouchberry on 4/12/17.
 */
public class MathProblemTest {
    @Test
    public void fizzBuzzerBuzzBuzz() {
        assertEquals("Fizz", MathProblem.getResult(3));
        assertEquals("Buzz", MathProblem.getResult(5));
        assertEquals("FizzBuzz", MathProblem.getResult(15));
    }

    @Test
    public void fibProblem() {
        assertArrayEquals(new int[] { 1, 1, 2, 3, 5 }, MathProblem.fibSeq(5));
    }
}