package Vetores.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Vetor2 {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vetor = new Product[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vetor[i] = new Product(name, price);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPrice();
        }

        double avg = soma / n;

        System.out.printf("Average price: %.2f%n", avg);

    }
}
