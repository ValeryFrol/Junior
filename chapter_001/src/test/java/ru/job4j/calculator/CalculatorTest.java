package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void whenAddOnePlusOne() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));

    }
    public void whenTwoMinusOne() {
        Calculator calc = new Calculator();
        calc.sub(2, 1);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));

    }
    public void whenMaltTwoTwo() {
        Calculator calc = new Calculator();
        calc.mult(2, 2);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));

    }
    public void whenDivFourToTwo() {
        Calculator calc = new Calculator();
        calc.div(4, 2);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));

    }
}
