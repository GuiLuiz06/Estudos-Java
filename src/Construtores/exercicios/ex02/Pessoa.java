package Construtores.exercicios.ex02;

public class Pessoa {

    public int idade;
    public String nome;

    public Pessoa(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public String toString() {
        return "Nome: " + nome + "\n"
                + "Idade: " + idade;
    }

}
