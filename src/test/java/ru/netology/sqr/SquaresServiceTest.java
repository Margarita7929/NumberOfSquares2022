package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresServiceTest {

    @Test
    void sqrtCountExpectedResult6() {
        SquaresService service = new SquaresService();
        int lowLimit = 10;
        int upperLimit = 99;
        int expected = 6;

        int actual = service.sqrtCount(lowLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    void sqrtCountExpectedResult5() {
        SquaresService service = new SquaresService();
        int lowLimit = 10;
        int upperLimit = 99;
        int expected = 5;

        int actual = service.sqrtCount(lowLimit, upperLimit);

        assertEquals(expected, actual);
    }

    @Test
    void sqrtCountExpectedResult7() {
        SquaresService service = new SquaresService();
        int lowLimit = 10;
        int upperLimit = 99;
        int expected = 7;

        int actual = service.sqrtCount(lowLimit, upperLimit);

        assertEquals(expected, actual);
    }
}