package ru.job4j.array;

import java.util.Arrays;

/**
 * обертка над строкой
 */

public class ArrayChar {

    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * проверяет, что слово начинается с префикса
     *
     * @param prefix префикс
     * @return true, если слово начинается с префикса
     */
    public boolean startWith(String prefix) {

        boolean result = true;
        char[] value = prefix.toCharArray();
        if (value.length > data.length) {
            return false;
        }
        for (int i = 0; i < value.length; i++) {
            if (data[i] != value[i]) {
                result = false;
                break;
            }
        }

        return result;
    }

   /* public static void main(String[] args) {

        int [] smallPrimes = {1,3,5,7};
        int [] luckyNumbers = smallPrimes;
        luckyNumbers[0] = 12;
        System.out.println(Arrays.toString(smallPrimes));
        System.out.println(Arrays.toString(luckyNumbers));

        int [] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, 2*luckyNumbers.length);
    }*/
}
