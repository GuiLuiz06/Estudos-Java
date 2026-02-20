package Encapsulamento;

public class Product {

    // alteração de public para private, fazendo com que o objeto so seja acessável na própria classez
    String name;
    private double price;
    private int quantidade;

    public Product() {
    }

    // Exemplo de sobrecarga
    public Product(String name, double price, int quantidade) {
        this.name = name;
        this.price = price;
        this.quantidade = quantidade;
    }

    // Exemplo de sobrecarga
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantidade() {
        return quantidade;
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
