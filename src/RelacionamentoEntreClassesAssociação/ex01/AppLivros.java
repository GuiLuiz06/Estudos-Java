package RelacionamentoEntreClassesAssociação.ex01;

import java.time.LocalDate;

public class AppLivros {
    public static void main(String[] args) {

        Midia[] midia = new Midia[3];
        midia[0] = new Midia(1, "PDF");
        midia[1] = new Midia(2, "áudio");
        midia[2] = new Midia(3, "Papel");

        Livro[] livro = new Livro[3];
        livro[0] = new Livro(1, "Chapeuzinho vermelho", "Lobo mau");
        livro[1] = new Livro(2, "Mente milionária", "Controle financeiro");

        Edicao[] edicao = new Edicao[5];
        edicao[0] = new Edicao(1, 2012, livro[0], midia[0]);
        edicao[1] = new Edicao(2, 2010, livro[1], midia[1]);
        edicao[2] = new Edicao(3, 2009, null, midia[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(edicao[i].emprestimo(LocalDate.now()) ? "emprestimo realizado": "Exemplar não está disponível");
        }

        System.out.println();
        System.out.println(edicao[1].devolucao() ? "Devolução realizada": "Exemplar não está emprestado");

        System.out.println();
        System.out.println(livro[0].getIdLivro() + "\n");
        System.out.println(livro[0].getTitulo());
        System.out.println(edicao[0].getAno());
        System.out.println(edicao[0].getSituacao());
        System.out.println(midia[0].getDescricao());


    }
}

