package Assuntos.StartPoo.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter retangle width and height: ");
        rectangle.w = sc.nextDouble();
        rectangle.h = sc.nextDouble();

        System.out.println(rectangle);

    }
}
