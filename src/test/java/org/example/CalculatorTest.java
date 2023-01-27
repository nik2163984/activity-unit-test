package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int expected = 10;
        int actual = new Calculator().add(2, 8);
        assertEquals(expected, actual);
    }

    @Test
    void testAdd() {
        int expected = 12;
        int actual = new Calculator().add(2, 8, 2);
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        int expected = 0;
        int actual = new Calculator().subtract(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int expected = 20;
        int actual = new Calculator().multiply(2, 10);
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        int expected = 32;
        int actual = new Calculator().divide(96, 3);
        assertEquals(expected, actual);

        expected = 0;
        actual = new Calculator().divide(1, 2);
        assertEquals(expected, actual);
    }
}