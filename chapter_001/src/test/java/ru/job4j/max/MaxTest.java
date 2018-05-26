package ru.job4j.max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MaxTest {
    @Test

    public void maxTest() {
        Max maximum = new Max();
        int result = maximum.max(3, 8);
        int expected = 8;
        assertThat(result, is(expected));


    }
}
