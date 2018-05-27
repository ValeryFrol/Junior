package ru.job4j.max;

public class Max {

    public Integer maxOfTwo(int x, int y) {
        int max = (x < y) ? y : x;

        return max;

    }

    public Integer maxOfThree(int a, int b, int c) {
        int max;
        Max maximum = new Max();
        int temp = maximum.maxOfTwo(a, b);
        max = maximum.maxOfTwo(temp, c);

        return max;


    }


}
