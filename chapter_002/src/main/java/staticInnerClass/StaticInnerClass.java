package staticInnerClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StaticInnerClass {
    public static void main(String[] args) {
        double[] numbers = {2.3,4.2,-1.0};
        System.out.println(ArraySearch.minMax(numbers).getFirst()+" "+ArraySearch.minMax(numbers).getSecond());
        System.out.println(ArraySearch.minMax(numbers));
        Arrays.toString(numbers);
    }




}
