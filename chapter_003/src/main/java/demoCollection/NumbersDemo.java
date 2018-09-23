package demoCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDemo {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.remove(new Integer(1));
//        System.out.println(numbers);
//        List<String> list = new ArrayList<>();
//        list.add("hawk");
//        list.add("bird");
//        Object[] object = list.toArray();
//        System.out.println(object.length);
//        String[] stringArray = list.toArray(new String[0]);
//        System.out.println(stringArray.length);

        String[] array = {"hawk", "bird"};
        List<String> result = Arrays.asList("sdfdsf", "dfdsfsd", "dsfsdf", "dsfdsf"); //вернет List фиксированного размера
        System.out.println(result);
        result.set(1, "test");
        array[0] = "new";
        for (String p : array) {
            System.out.println(p + " ");
        }
        result.remove(1);
    }
}
