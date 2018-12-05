package soloTasks;

public class NumberBy11 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (i == (i / 11) * 11 + (a * a + b * b + c * c)) System.out.println(i);
        }
    }
}
