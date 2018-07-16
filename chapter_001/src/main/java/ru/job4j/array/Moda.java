package ru.job4j.array;

public class Moda {
    public int median(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        result = array[array.length / 2];
        return result;
    }

    public int moda(int[] array) {
        int result = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count += 1;
                }
            }
            if (count > max) {
                max = count;
                result = array[i];
                count = 0;
            }
        }
        return result;
    }
}
