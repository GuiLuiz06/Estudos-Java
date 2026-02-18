package StartPoo.exercicios.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DadosPessoais x;
        x = new DadosPessoais();

        System.out.println("Digite o seu nome completo: ");
        x.nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        x.idade = sc.nextInt();

        System.out.println("Digite a sua altura: ");
        x.altura = sc.nextDouble();

        System.out.println("Olá, " + x.nome + ", você tem " + x.idade + " anos e tem " + x.altura + " de altura. (:");
    }
}
