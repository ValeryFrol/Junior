package ru.job4j.condition;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DummyBotTest {

    @Test
    public void dummyBotTest() {
        String inputString = "Hi Bot!";
        DummyBot dm = new DummyBot();
        String result = dm.answer(inputString);
        String expected = "Hi dude!";
        assertThat(result, is(expected));

    }
}
