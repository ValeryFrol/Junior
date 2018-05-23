package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ConverterTest {
    double sumRub = 100;
    double rate = 60;

    @Test

    public void convertRubToUsdTest() {
        Converter convert = new Converter();
        convert.convertRubToUsd(sumRub);
        double result = convert.getResult();
        double expected = sumRub / rate;
        assertThat(result, is(expected));
    }

    public void convertRubToEurTest() {
        Converter convert = new Converter();
        convert.convertRubToEur(sumRub);
        double result = convert.getResult();
        double expected = sumRub / rate;
        assertThat(result, is(expected));
    }

    public void convertUsdToRubTest() {
        Converter convert = new Converter();
        convert.convertUsdToRub(sumRub);
        double result = convert.getResult();
        double expected = sumRub / rate;
        assertThat(result, is(expected));
    }

    public void convertEurToRubTest() {
        Converter convert = new Converter();
        convert.convertEurToRub(sumRub);
        double result = convert.getResult();
        double expected = sumRub / rate;
        assertThat(result, is(expected));
    }


}
