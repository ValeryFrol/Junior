package ru.job4j.calculator;

public class Converter {

    private static double usdToRub = 60;
    private static double eurToRub = 70;
    private double result;

    public double getResult() {
        return result;
    }

    public void convertRubToUsd(double rub) {
        Calculator calc = new Calculator();
        calc.div(rub, usdToRub);
        this.result = calc.getResult();
    }

    public void convertRubToEur(double rub) {
        Calculator calc = new Calculator();
        calc.div(rub, eurToRub);
        this.result = calc.getResult();
    }

    public void convertUsdToRub(double usd) {
        Calculator calc = new Calculator();
        calc.mult(usd, usdToRub);
        this.result = calc.getResult();
    }

    public void convertEurToRub(double eur) {
        Calculator calc = new Calculator();
        calc.mult(eur, eurToRub);
        this.result = calc.getResult();
    }

}
