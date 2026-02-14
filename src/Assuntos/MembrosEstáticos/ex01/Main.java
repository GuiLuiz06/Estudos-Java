package Assuntos.MembrosEstáticos.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the product price? ");
        double productPrice = sc.nextDouble();

        System.out.print("How many units? ");
        int quantity = sc.nextInt();

        double TotalComDesconto = ProductCalculator.desconto(productPrice,quantity);

        System.out.printf("Total amount with discount = %.2f", TotalComDesconto);

    }
}
