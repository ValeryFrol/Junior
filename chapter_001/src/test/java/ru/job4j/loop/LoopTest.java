package ru.job4j.loop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LoopTest {

    @Test
    public void loopTest() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int expected = 30;
        assertThat(result, is(expected));
    }


}
