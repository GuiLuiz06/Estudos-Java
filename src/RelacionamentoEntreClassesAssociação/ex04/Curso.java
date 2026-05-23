package RelacionamentoEntreClassesAssociação.ex04;

import java.util.Scanner;

public class Curso {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Digite um valor inteiro..: ");
            int numero1 = input.nextInt();

            System.out.print("Digite um valor inteiro..: ");
            int numero2 = input.nextInt();

            System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        }
        catch (Exception ex) {
            System.out.println("ERRO - Valor digitado não é um numero inteiro!");
        }
        finally {
            System.out.println("Programa encerrado");
        }

        input.close();
    }


}
