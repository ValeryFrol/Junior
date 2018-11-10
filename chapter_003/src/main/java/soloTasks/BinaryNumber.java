package soloTasks;

public class BinaryNumber {
    public static void toBinary(int number) {
        StringBuilder binaryNumber = new StringBuilder();
        while (number > 0) {
            binaryNumber.append(number % 2);
            number /= 2;
        }
        System.out.println(binaryNumber.reverse().toString());
    }

    public static void main(String[] args) {
        toBinary(91);
    }
}
