package ru.netology.sqr;

public class SquaresService {

    public int sqrtCount(int lowerLimit, int upperLimit) {
        int count = 0;
        for (int i = 4; i <= upperLimit; i++) {
            if (i * i >= lowerLimit)
                if (i * i <= upperLimit) {
                    count++;
                }
        }
        return count;
    }
}