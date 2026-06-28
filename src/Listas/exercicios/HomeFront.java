package Listas.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HomeFront {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        Integer x = sc.nextInt();

        System.out.println();
        for (int i = 0; i < x; i++) {
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Listas.exercicios.Employee emp = new Listas.exercicios.Employee(id, name, salary);

            list.add(emp);

            System.out.println();
        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase : ");
        Integer idIncrease = sc.nextInt();

        // Integer posicao = positionId(list, idIncrease);

        Employee emp = list.stream().filter(y -> y.getId() == idIncrease).findFirst().orElse(null);

        if (emp == null) {
            System.out.print("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");

        System.out.println();
        for (Employee e : list) {
            System.out.println(e);
        }

        sc.close();

    }

    public static Integer positionId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
