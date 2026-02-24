package SeparaçãoResponsabilidades.exercicios.ex07;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println(ClassificadorEtario.classificacao(idade));

        sc.close();
    }
}
