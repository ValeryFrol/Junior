package ru.job4j.points;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointsTest {

    @Test
    public void pointsTest() {
        Points a = new Points(1, 1);
        Points b = new Points(4, 5);
        a.distanceTo(b);
        double result = a.getLength();
        double expected = 5.0;
        assertThat(result, is(expected));
    }

}
