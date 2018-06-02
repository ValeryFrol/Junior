package ru.job4j.loop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BoardTest {

    @Test
    public void when3x3() {
        Board board = new Board();
        String result = board.paint(3, 3);
        String sep = System.lineSeparator();
        assertThat(result, is(String.format("X X%s X %sX X%s", sep, sep, sep))); //возвращает строку. Printf - только для вывода в консоль.
        // String.format  - возвращает строку и ее можно сохранить в переменную для дальнейшего использования
        // System.out.printf("X X%s X %sX X%s", sep, sep, sep);
    }
}
