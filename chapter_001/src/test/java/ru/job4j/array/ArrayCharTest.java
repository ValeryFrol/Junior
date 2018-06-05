package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar arraychar = new ArrayChar("Hello");
        boolean result = arraychar.startWith("Hel");
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar arraychar = new ArrayChar("Hello");
        boolean result = arraychar.startWith("Kfg");
        assertThat(result, is(false));
    }
}
