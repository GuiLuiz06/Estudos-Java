package Construtores.exercicios.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.next();

        Produto produto = new Produto(nome);

        System.out.print("Digite o preço: ");
        produto.preco = sc.nextDouble();

        System.out.print(produto);
    }
}
