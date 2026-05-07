package Construtores.exercicios.ex03;

public class Produto {

    public String nome;
    public static double preco;


    public Produto(String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public static double aplicarDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    public String toString() {
        return "Nome: " + nome + "\n"
                + "Preço: " + String.format("%.2f", aplicarDesconto(25));
    }

}
