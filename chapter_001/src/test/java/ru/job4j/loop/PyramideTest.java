package ru.job4j.loop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.StringJoiner;

public class PyramideTest {

    @Test
    public void pyramideRightTest() {
        Paint paint = new Paint();
        String result = paint.rightTriangle(4);
        System.out.println(result);
        assertThat(result, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())//аналогичен StringBuilder, но удобнее
                        .add("^   ")
                        .add("^^  ")
                        .add("^^^ ")
                        .add("^^^^")
                        .toString()
                )
        );


    }


}
