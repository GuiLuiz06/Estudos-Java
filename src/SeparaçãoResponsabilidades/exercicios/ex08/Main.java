package SeparaçãoResponsabilidades.exercicios.ex08;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        double radius = sc.nextDouble();

        Product product = new Product();

        System.out.println(product);

        sc.close();
    }


}

