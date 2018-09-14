package hhtaskA;

import java.util.*;

public class MinMissedNumber {

    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            if (sc.nextInt() > 0) numbers.add(sc.nextInt());
        }
        Iterator<Integer> iter = numbers.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


        int[] array = {1, 3, 8, 4, 1, 5};
        Arrays.sort(array);
        ArrayList<Integer> missed = new ArrayList<Integer>();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                int diff = array[i + 1] - array[i];
                if (diff != 1) {
                    for (int j = 1; j < diff; j++) {
                        missed.add(array[i] + j);
                    }
                }
            }
        }
        Collections.sort(missed);
        System.out.println(missed.get(0));
    }


}
