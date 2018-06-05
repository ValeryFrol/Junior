package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void bubbleSortTest() {
        BubbleSort bs = new BubbleSort();
        int[] input = {1, 7, 2, 9, 4, 5, 1};
        int[] expected = {1, 1, 2, 4, 5, 7, 9};
        int[] result = bs.sort(input);
        assertThat(result, is(expected));
    }
    @Test
    public void bubbleSortTest2() {
        BubbleSort bs = new BubbleSort();
        int[] input = {1, 7, 2, 9, 4, 5};
        int[] expected = {1, 2, 4, 5, 7, 9};
        int[] result = bs.sort(input);
        assertThat(result, is(expected));
    }
}
