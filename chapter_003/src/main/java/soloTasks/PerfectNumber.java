package soloTasks;

import java.math.BigInteger;

public class PerfectNumber {
    public static long sumOfFirst8PerfectNumbers() {
        long result = 0, number;
        int counter = 0, power = 1;
        while (counter < 8) {
            number = austinPowersGoldMember(2, power - 1) * (austinPowersGoldMember(2, power) - 1);
            if (isPerfect(number)) {
                result += number;
                counter++;
            }
            power++;
        }
        return result;
    }

    public static boolean isPerfect(long number) {
        int sum = 0;
        for (int i = 1; i < number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        if (sum == number) return true;
        return false;
    }

    public static long austinPowersGoldMember(int number, int power) {
        {
            if (power == 0) return 1;
            int result = number;

            while (power > 1) {
                result *= number;
                power--;
            }
            return (long) result;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirst8PerfectNumbers());
    }
}
