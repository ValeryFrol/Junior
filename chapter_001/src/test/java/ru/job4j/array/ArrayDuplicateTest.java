package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Arrays;

public class ArrayDuplicateTest {

    @Test
    public void arrayDuplicateTest() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = ad.remove(input);
        String[] expected = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expected));
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void arrayDuplicateTest2() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] input = {"Привет", "Привет", "Привет", "Привет", "Привет"};
        String[] result = ad.remove(input);
        String[] expected = {"Привет"};
        assertThat(result, is(expected));
        System.out.println(Arrays.toString(result));
    }
}
