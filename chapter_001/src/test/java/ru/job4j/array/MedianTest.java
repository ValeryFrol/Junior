package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Arrays;

public class MedianTest {
    @Test
    public void averageTest() {
        Median median = new Median();
        int[] input = {2, 5, 6, 1};
        double result = median.average(input);
        double expected = 14 / 4.0;
        assertThat(result, is(expected));
    }

    @Test
    public void medianTest() {
        Median median = new Median();
        int[] input = {2, 5, 6, 1};
        double result = median.median(input);
        System.out.println(Arrays.toString(input));
        double expected = 3.5;
        assertThat(result, is(expected));
    }

    @Test
    public void medianTest2() {
        Median median = new Median();
        int[] input = {2, 5, 6, 1, 3};
        double result = median.median(input);
        System.out.println(Arrays.toString(input));
        double expected = 3.0;
        assertThat(result, is(expected));
    }
}
