package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FindLoopTest {
    @Test
    public void findLoopTest() {
        FindLoop fl = new FindLoop();
        int[] input = {1, 2, 3};
        int result = fl.findLoop(input, 2);
        int expected = 1;
        assertThat(result, is(expected));
    }
    @Test
    public void findLoopTestTwo() {
        FindLoop fl = new FindLoop();
        int[] input = {1, 2, 3};
        int result = fl.findLoop(input, 5);
        int expected = -1;
        assertThat(result, is(expected));
    }

}
