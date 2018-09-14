package other;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class My {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        String s = sc.nextLine();
        char[] sArray = s.toCharArray();
            if (sArray[0] != '-') numbers.add(Character.getNumericValue(sArray[0]));
                for (int i = 1; i < sArray.length; i++) {
                    if (sArray[i - 1] != '-') {
                        numbers.add(Character.getNumericValue(sArray[i]));
                    } else {
                        continue;
                    }
                }
        Iterator<Integer> itr = numbers.iterator();
            do {
                System.out.println(itr.next());
            }
            while (itr.hasNext());
    }
}

