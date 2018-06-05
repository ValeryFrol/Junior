package ru.job4j.array;

import java.util.Arrays;

public class Check {

    public boolean mono(boolean[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) {
                return false;
            }
        }
        return true;
    }


}
