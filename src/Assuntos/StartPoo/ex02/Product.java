package Assuntos.StartPoo.ex02;

public class Product {

    public String name;
    public double price;
    public int quantidade;

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
