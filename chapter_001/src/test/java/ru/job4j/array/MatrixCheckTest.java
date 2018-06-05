package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MatrixCheckTest {

    @Test
    public void matrixCheckTestNechet() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] input = new boolean[][]{{true, false, false}, {false, true, true}, {false, true, true}};
        boolean result = matrixCheck.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void matrixCheckTestChet() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] input = new boolean[][]{{true, true}, {true, true}};
        boolean result = matrixCheck.mono(input);
        assertThat(result, is(true));
    }
}
