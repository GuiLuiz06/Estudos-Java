package SeparaçãoResponsabilidades.exercicios.ex06;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dol = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double qtdDol = sc.nextDouble();

        double converter = CurrencyConverter.converter(dol, qtdDol);

        System.out.printf("Amount to be paid in reais = %.2f", converter);
    }
}
