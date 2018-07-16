package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int count = array.length;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[ count - 1];
                    count--;
                    j--;
                }
            }
        }

        return Arrays.copyOf(array, count);
    }
}
