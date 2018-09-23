package demoCollection;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

    @NotNull
    static Integer loadByName(String Name) {
        return 1;
    }

    @Nullable
    static Integer findyName(String name) {
        ////
        return null;
    }

    public static void main(String[] args) {
        Integer result = findyName("Sdfsd");
        result++;

        result = loadByName("sdfs");
        result++;

        Long d = Long.valueOf("String");
        Long.parseLong("4");


        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        weights.add(new Double(60));
        weights.remove(50.5);
        double first = weights.get(0);

        List<Integer> heights = new ArrayList<>();
        heights.add(null); //все ок
        int h = heights.get(0);

    }


}
