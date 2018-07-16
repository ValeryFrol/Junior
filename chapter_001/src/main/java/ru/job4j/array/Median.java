package ru.job4j.array;

import java.util.Arrays;

public class Median {

    public double average(int[] array) {
        double result = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            result = sum / array.length;
        }
        return result;
    }

    public double median(int[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        if (array.length % 2 == 0) {
            result = (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            result = array[array.length / 2];
        }
        return result;
    }
}
