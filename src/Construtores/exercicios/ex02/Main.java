package Construtores.exercicios.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();
        sc.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(idade, nome);

        System.out.println(pessoa);

    }
}
