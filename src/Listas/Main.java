package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Guilherme");
        list.add("Lionel Messi");
        list.add("Maria");
        list.add("Ana clara");
        list.add("Amanda");
        list.add(2, "Júlio");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-".repeat(30));
        list.removeIf(x -> x.charAt(0) == 'M'); // Funcção lambda (predicato)

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-".repeat(30));

        System.out.println("index of Lionel Messi: " + list.indexOf("Lionel Messi"));
        System.out.println("index of Marcos: " + list.indexOf("Marco"));

        System.out.println("-".repeat(30));

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-".repeat(30));

        String name = list.stream().filter(x -> x.charAt(0) == 'Y').findFirst().orElse(null);
        System.out.println(name);

    }

}
