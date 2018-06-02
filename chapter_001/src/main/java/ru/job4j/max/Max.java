package ru.job4j.max;

public class Max {

    public Integer maxOfTwo(int x, int y) {
        return (x < y) ? y : x;

    }

    public Integer maxOfThree(int a, int b, int c) {
        return maxOfTwo(maxOfTwo(a, b), c);
    }


}
