package soloTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static Integer[] quickSortArray(Integer[] arr) {
        if (arr.length <= 1) return arr;
        int a0 = arr[0];
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> great = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < a0) less.add(arr[i]);
            else {
                great.add(arr[i]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(quickSortArray(less.toArray(new Integer[0]))));
        result.add(a0);
        result.addAll(Arrays.asList(quickSortArray(great.toArray(new Integer[0])))); //toArray returns Object, that's why we have to point that we want an arrray of Integers by new Integer[0]
        return result.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 9, 3, 7, 5, 4, 9, 8, 2};
        System.out.println(Arrays.toString(quickSortArray(arr)));
    }
}