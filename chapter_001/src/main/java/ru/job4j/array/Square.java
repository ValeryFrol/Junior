package ru.job4j.array;


public class Square {

    public int[] calculate(int number) {
        int[] result = new int[number];
        for (int i = 0; i < number; i++) {
            result[i] = i * i;
        }
        return result;
    }
}
