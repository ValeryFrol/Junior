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

    @Test
    public void pyramideLeftTest() {
        Paint paint = new Paint();
        String result = paint.leftTriangle(4);
        System.out.println(result);
        assertThat(result, is(
                new StringJoiner(System.lineSeparator(), "", System.lineSeparator())//аналогичен StringBuilder, но удобнее
                        .add("   ^")
                        .add("  ^^")
                        .add(" ^^^")
                        .add("^^^^")
                        .toString()
                )
        );
    }

    @Test
    public void pyramideTest() {
        Paint paint = new Paint();
        String result = paint.pyramide(4);
        System.out.println(result);
        assertThat(result, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("   ^   ")
                        .add("  ^^^  ")
                        .add(" ^^^^^ ")
                        .add("^^^^^^^")
                        .toString()
                )
        );
    }
    @Test
    public void pyramideTest2() {
        Paint paint = new Paint();
        String result = paint.pyramide(2);
        System.out.println(result);
        assertThat(result, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add(" ^ ")
                        .add("^^^")
                        .toString()
                )
        );
    }
}


