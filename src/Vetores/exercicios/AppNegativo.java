package Vetores.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AppNegativo {
    public static void main(String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] neg = new int[n];


        for (int i = 0; i < neg.length; i++) {
            System.out.print("Digite um número: ");
            neg[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Números negativos: ");

        for(int i = 0; i < neg.length; i++) {
            if (neg[i] < 0) {
                System.out.println();
                System.out.print(neg[i]);
            }
        }

        sc.close();

    }
}
