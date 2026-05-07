package Vetores.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma+=altura[i];
        }
        double avg = soma / n;

        System.out.printf("A média entre as alturas é: %.2f%n", + avg);

        sc.close();

    }
}
