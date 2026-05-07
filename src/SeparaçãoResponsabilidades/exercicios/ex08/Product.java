package SeparaçãoResponsabilidades.exercicios.ex08;

public class Product {

    public static final double PI = 3.14159;
    public double radius;

    public static double AreaCircle(double radius) {
        double area = PI * (radius * radius);
        return area;
    }

    public String toString() {
        return "A=" + String.format("%.4f", AreaCircle(2));
    }

}
