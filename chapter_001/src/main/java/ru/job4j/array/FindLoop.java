package ru.job4j.array;

public class FindLoop {

    public int findLoop(int[] data, int x) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == x) {
                result = i;
                break;
            }
        }
        return result;
    }
}
