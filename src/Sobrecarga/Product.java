package Sobrecarga;

public class Product {

    public String name;
    public double price;
    public int quantidade;

    // sobrecarga = disponibilizar mais de uma versão da mesma operação (muda somente o parâmetro)
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
