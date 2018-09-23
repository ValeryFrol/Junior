package hhtaskA;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumMissedNumber {

    static int findMinNumber(ArrayList<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            int index = Math.abs(data.get(i)) - 1;
            if (index < data.size() && data.get(index) > 0) {
                data.set(index, -data.get(index));
            }
        }
        for (int j = 0; j < data.size(); j++) {
            if (data.get(j) > 0) {
                return j + 1;
            }
        }
        return data.size() + 1;
    }

    static void solveTask(ArrayList<Integer> data) {
        int result = findMinNumber(data);
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Введите числа от -10^9 до 10^9");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (String value : s.split(" ")) {
            int number = Integer.valueOf(value);
            if (number > 0) {
                intArray.add(Integer.valueOf(value));
            }
        }
        solveTask(intArray);
    }
}
