package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String sep = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((j + i) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(sep);
        }
        return screen.toString();
    }
    }
