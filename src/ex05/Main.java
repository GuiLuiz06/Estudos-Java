package ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        System.out.print("Digite seu nome: ");
        std.Name = sc.nextLine();
        System.out.println("Digite as três notas: ");
        std.notaA = sc.nextDouble();
        std.notaB = sc.nextDouble();
        std.notaC = sc.nextDouble();

        if (std.NotaTotal() < 60.0) {
            System.out.println("FINAL GRADE: " + std.NotaTotal());
            System.out.println("FAILED");
            System.out.println("MISSING " + std.Final() + " POINTS");
        }
        else {
            System.out.println("NOTA FINAL: " + std.NotaTotal());
            System.out.println("PASS");
        }
    }
}
