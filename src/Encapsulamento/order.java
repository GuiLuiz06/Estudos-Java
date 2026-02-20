package Encapsulamento;

import java.util.Date;

public class order {

    public Date date;
    private Product product;

    // no "this.product.name" o '.name' vem de outra classe que está sem nada no modificador de acesso, podendo ser acessado nas classes do mesmo pacote
    public order(Date date, Product product) {
        this.date = date;
        this.product.name = "tv";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
