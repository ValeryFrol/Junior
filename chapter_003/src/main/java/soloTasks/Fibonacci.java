package soloTasks;

public class Fibonacci {
    public static int fibonacciNumberMethodOne(int a) {
        int result = 0, x = 1, y = 1, counter = 0;
        if (a == 1) return 0;
        else if (a == 2) return 1;
        while (counter < (a - 2)) {
            result = x + y;
            x = y;
            y = result;
            counter += 1;
        }
        return result;
    }

    public static int fibonacciNumberMethodTwo(int a) {
        int result = 0;
        result = (int) (1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, (double) a) - Math.pow((1 - Math.sqrt(5)) / 2, (double) a)));
        return result;
    }

    public static int fibonacciNumberMethodThree(int a) {
        if (a == 1) return 1;
        if (a == 2) return 1;
        else {
            return fibonacciNumberMethodThree(a - 1) + fibonacciNumberMethodThree(a - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciNumberMethodOne(14));
        System.out.println(fibonacciNumberMethodTwo(14));
        System.out.println(fibonacciNumberMethodThree(14));
    }
}
