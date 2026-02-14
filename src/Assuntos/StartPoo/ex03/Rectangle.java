package Assuntos.StartPoo.ex03;

public class Rectangle {

    public double w;
    public double h;

    public double area() {
        return w * h;
    }

    public double perimeter() {
        return (h + h) + (w + w);
    }

    public double diagonal() {
        return Math.sqrt(w * w + (h * h));
    }

    public String toString() {
        return "Área = " + String.format("%.2f", area()) + "\nPerimeter: " +
                String.format("%.2f", perimeter()) + "\nDiagonal: " + String.format("%.2f", diagonal());
    }

}
