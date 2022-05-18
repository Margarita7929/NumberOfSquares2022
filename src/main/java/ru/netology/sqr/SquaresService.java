package ru.netology.sqr;

public class SquaresService {

    public int sqrtCount(int lowerRangeLimit, int upperRangeLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i*i >= lowerRangeLimit && i*i <= upperRangeLimit) {
                    count++;
                }
        }
        return count;
    }
}