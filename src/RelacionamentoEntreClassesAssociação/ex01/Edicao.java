package RelacionamentoEntreClassesAssociação.ex01;

import java.time.LocalDate;

public class Edicao {

    private int idEdicao;
    private int ano;
    private char situacao;
    private LocalDate ultimoEmprestimo;
    private Livro livro;
    private Midia midia;

    public Edicao(int idEdicao, int ano, Livro livro, Midia midia) {
        this.idEdicao = idEdicao;
        this.ano = ano;
        situacao = 'D';
        ultimoEmprestimo = null;
        this.livro = livro;
        this.midia = midia;
    }

    public boolean emprestimo(LocalDate Data) {

        if (situacao == 'D') {
            ultimoEmprestimo = Data;
            this.situacao = 'E';
            return true;
        }
        return false;
    }

    public boolean devolucao() {

        if (situacao == 'E') {
            this.situacao = 'D';
            return true;
        }
        return false;
    }

    public int getAno() {
        return ano;
    }

    public char getSituacao() {
        return situacao;
    }

}
