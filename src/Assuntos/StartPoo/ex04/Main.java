package Assuntos.StartPoo.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.Name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.GrossSalary = sc.nextDouble();
        System.out.print("tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);
        System.out.println();

        System.out.println("Updated data: " + emp);

    }
}
