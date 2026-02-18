package Construtores.exercicios.ex01;

public class Produto {

    public double value;
    public double nPedido;
    public static int contador = 0;


    public Produto(double value) {
        contador++;
        this.value = value;
        this.nPedido = contador;
    }

    public String toString() {
        return "Pedido nº " + contador
                + ", valor: $ "
                + String.format("%.2f", value);
    }
}
