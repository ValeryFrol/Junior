package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if ((data[i][i] == true) && (data[i][data.length - i - 1] == true)) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}

