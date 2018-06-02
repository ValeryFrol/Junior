package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TurnTest {
    @Test
    public void turnTest() {
        int[] input = {1, 2, 3, 4, 5};
        Turn turn = new Turn();
        int[] result = turn.turn(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
    @Test
    public void turnTest2() {
        int[] input = {1, 2, 3, 4};
        Turn turn = new Turn();
        int[] result = turn.turn(input);
        int[] expected = {4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}
