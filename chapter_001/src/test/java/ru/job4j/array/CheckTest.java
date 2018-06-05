package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CheckTest {

    @Test
    public void checkTest() {
        Check check = new Check();
        boolean[] input = {true, true, true};
        boolean result = check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void checkTest2() {
        Check check = new Check();
        boolean[] input = {false, false};
        boolean result = check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void checkTest3() {
        Check check = new Check();
        boolean[] input = {false, true};
        boolean result = check.mono(input);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}
