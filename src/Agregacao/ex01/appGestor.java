package Agregacao.ex01;

import java.time.LocalDate;

public class appGestor {
    public static void main(String[] args) {

        try {
            Recurso r1 = new Recurso("Acesso à computador durante a aula", 'C');
            Recurso r2 = new Recurso("Acesso a internet durante a aula", 'I');
            Recurso r3 = new Recurso("Quadro branco para explicação durante aula", 'Q');

            Aula aula = new Aula("Programação front-end", LocalDate.now());

            System.out.println(aula);

            aula.adicionarRecurso(r1);
            aula.adicionarRecurso(r2);
            aula.adicionarRecurso(r3);

            System.out.println(aula);

            aula.removerRecurso(r2);

            System.out.println(aula);
        } catch (Exception e) {
            System.out.println("Erro capturado - Tire print da tela e mostre ao administrador!");
            //e.printStackTrace();
        }

    }
}
