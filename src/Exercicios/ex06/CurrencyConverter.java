package Exercicios.ex06;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double dol, double qtdDol) {
        return dol * qtdDol * (1.0 + IOF);
    }
}