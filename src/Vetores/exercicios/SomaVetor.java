package Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] num = new double[n];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Valores: ");

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        double soma = 0.0;

        for (int i = 0; i < num.length; i++) {
            soma+= num[i];
        }
        System.out.println();
        System.out.println("Soma: " + soma);

        double media = soma / n;

        System.out.println("Média: " + media);
    }
}
