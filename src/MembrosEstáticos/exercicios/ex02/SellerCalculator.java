package MembrosEstáticos.exercicios.ex02;

public class SellerCalculator {

    public static final double PERCENTAGE = 0.12;

    public static double calculateFinalSalary(double salarioBase, double valorVendas) {
        double comissao = valorVendas * PERCENTAGE;
        return salarioBase + comissao;
    }
}
