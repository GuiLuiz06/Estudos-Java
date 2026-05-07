package Construtores.aula01;

public class Product {

    public String name;
    public double price;
    public int quantidade;

    // Definição de valores iniciais para o objeto
    public Product(String name, double price, int quantidade) {
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
    }

    public double valorTotalEmEstoque() {
        return price * quantidade;
    }

    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", "
                + quantidade + " units, total: $ " + String.format("%.2f", valorTotalEmEstoque());
    }

}
