package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            result = (data[i][i]) && (data[i][data.length - i - 1]);
        }
        return result;
    }
}

