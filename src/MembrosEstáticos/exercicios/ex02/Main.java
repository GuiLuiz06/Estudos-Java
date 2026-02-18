package MembrosEstáticos.exercicios.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the base salary? ");
        double salarioBase = sc.nextDouble();

        System.out.print("What is the total sales amount? ");
        double valorVendas = sc.nextDouble();

        double TotalSalary = SellerCalculator.calculateFinalSalary(salarioBase, valorVendas);

        System.out.printf("Final salary = %.2f", TotalSalary);
    }
}
