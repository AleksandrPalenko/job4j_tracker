package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testMax() {
        int first = 1;
        int second = 2;
        int third = 3;
        int four = 4;
        int result = Calculator.max(first, second, third, four);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}