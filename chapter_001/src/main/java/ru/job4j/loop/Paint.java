package ru.job4j.loop;

public class Paint {

    public String pyramide(int height) {
        int width = height * 2 - 1;
        StringBuilder screen = new StringBuilder();
        String sep = System.lineSeparator();

        for (int row = 0; row < height; row++) {
            for (int column = 0; column < height - row - 1; column++) {
                screen.append(" ");
            }
            for (int column = 0; column < row * 2 + 1; column++) {
                screen.append("^");
            }
            for (int column = 0; column < height - row - 1; column++) {
                screen.append(" ");
            }
            screen.append(sep);
        }
        return screen.toString();

    }

    public String rightTriangle(int height) {
        int width = height;
        StringBuilder screen = new StringBuilder();
        String sep = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i >= j) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(sep);
        }
        return screen.toString();
    }

    public String leftTriangle(int height) {
        int width = height;
        StringBuilder screen = new StringBuilder();
        String sep = System.lineSeparator();
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < width; column++) {
                if (row >= width - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(sep);
        }
        return screen.toString();
    }
}
