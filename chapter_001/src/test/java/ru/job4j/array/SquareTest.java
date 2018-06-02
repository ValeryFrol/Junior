package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SquareTest {
    @Test
    public void squareTest() {
        Square sq = new Square();
        int[] rs = sq.calculate(3);
        int[] expected = {0, 1, 4}; //do we have to write new int[] before the {}
        assertThat(rs, is(expected));
    }

    @Test
    public void squareTestTwo() {
        Square sq = new Square();
        int[] rs = sq.calculate(5);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(rs, is(expected));
    }
}
