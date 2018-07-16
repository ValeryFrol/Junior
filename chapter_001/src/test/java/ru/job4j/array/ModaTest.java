package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.Arrays;

public class ModaTest {
    @Test
    public void medianTest() {
        Moda moda = new Moda();
        int[] input = {2, 5, 6, 1, 3};
        int result = moda.median(input);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void modaTest() {
        Moda moda = new Moda();
        int[] input = {2, 5, 5, 5, 3};
        int result = moda.moda(input);
        int expected = 5;
        assertThat(result, is(expected));
    }
}
