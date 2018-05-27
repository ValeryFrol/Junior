package ru.job4j.max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MaxTest {
    @Test

    public void maxOfTwoTest() {
        Max maximum = new Max();
        int result = maximum.maxOfTwo(3, 8);
        int expected = 8;
        assertThat(result, is(expected));


    }

    public void maxOfThreeTest() {
        Max maximum = new Max();
        int result = maximum.maxOfThree(1, 2, 3);
        int expected = 3;
        assertThat(result, is(expected));
    }
}
