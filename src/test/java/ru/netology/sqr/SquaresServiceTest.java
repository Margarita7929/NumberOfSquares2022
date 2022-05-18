package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresServiceTest {

    @Test
    void sqrtCountNoSquaresInRange() {
        SquaresService service = new SquaresService();
        int lowRangeLimit = 0;
        int upperRangeLimit = 99;
        int expected = 0;

        int actual = service.sqrtCount(lowRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);
    }

    @Test
    void sqrtCountMoreThanOneSquareInRange() {
        SquaresService service = new SquaresService();
        int lowRangeLimit = 110;
        int upperRangeLimit = 200;
        int expected = 4;

        int actual = service.sqrtCount(lowRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);
    }

    @Test
    void sqrtCountOneSquareInRange() {
        SquaresService service = new SquaresService();
        int lowRangeLimit = 110;
        int upperRangeLimit = 130;
        int expected = 1;

        int actual = service.sqrtCount(lowRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);
    }

    @Test
    void sqrtCountMaximumIterationNumber() {
        SquaresService service = new SquaresService();
        int lowRangeLimit = 9000;
        int upperRangeLimit = 9801;
        int expected = 5;

        int actual = service.sqrtCount(lowRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);
    }

    @Test
    void sqrtCountMinimumIterationNumber() {
        SquaresService service = new SquaresService();
        int lowRangeLimit = 100;
        int upperRangeLimit = 150;
        int expected = 3;

        int actual = service.sqrtCount(lowRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);
    }


}