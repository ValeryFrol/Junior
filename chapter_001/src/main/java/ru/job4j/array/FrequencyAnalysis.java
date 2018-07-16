package ru.job4j.array;

import java.util.Arrays;

public class FrequencyAnalysis {
    int count = 0;
    int max = 0;
    char result;

    public char findSimilarLetters(String str) {
        String s = str.toLowerCase();
        //System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = s.charAt(i);
            }
            else if(count == max){

            }
            count = 0;
        }
        return result;
    }
}
