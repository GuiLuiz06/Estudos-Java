package Construtores.exercicios.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String yn = "y";

        while (yn.equals("y")) {

            System.out.print("Enter order value: ");
            double value = sc.nextDouble();

            Produto produto = new Produto(value);

            System.out.print("Order data: " + produto + "\n");

            System.out.print("Create another order? (y/n)");
            yn = sc.next();
        }

        System.out.println();
        System.out.println("Total orders created: " + Produto.contador);

        sc.close();
    }
}
