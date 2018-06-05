package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MatrixTest {

    @Test
    public void matrixTest() {
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(3);
        int[][] expected = {{0, 0, 0}, {0, 1, 2}, {0, 2, 4}};
        assertThat(result, is(expected));
    }
}
