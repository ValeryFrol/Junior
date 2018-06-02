package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ConverterTest {
    double sum = 100;


    @Test
    public void convertRubToUsdTest() {
        Converter convert = new Converter();
        convert.convertRubToUsd(sum);
        double result = convert.getResult();
        double expected = sum / 60;
        assertThat(result, is(expected));
    }

    @Test
    public void convertRubToEurTest() {
        Converter convert = new Converter();
        convert.convertRubToEur(sum);
        double result = convert.getResult();
        double expected = sum / 70;
        assertThat(result, is(expected));
    }

    @Test
    public void convertUsdToRubTest() {
        Converter convert = new Converter();
        convert.convertUsdToRub(sum);
        double result = convert.getResult();
        double expected = sum * 60;
        assertThat(result, is(expected));
    }

    @Test
    public void convertEurToRubTest() {
        Converter convert = new Converter();
        convert.convertEurToRub(sum);
        double result = convert.getResult();
        double expected = sum * 70;
        assertThat(result, is(expected));
    }


}
