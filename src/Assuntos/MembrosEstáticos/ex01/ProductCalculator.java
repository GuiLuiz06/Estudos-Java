package Assuntos.MembrosEstáticos.ex01;

public class ProductCalculator {

    public static final double PER_DESCONTO = 0.08;

    public static double desconto(double productPrice, int quantity) {
        double valorTotal = productPrice * quantity;
        return valorTotal * (1 - PER_DESCONTO);
    }
}
