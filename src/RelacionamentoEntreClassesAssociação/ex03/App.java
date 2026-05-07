package RelacionamentoEntreClassesAssociação.ex03;

import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Empresa emp = new Empresa("1329.5434.4324-3434", "Guiliz tecnologia", "Guiliz ltda");
        Funcionario fun = new Funcionario('E', 3000, "Guilherme", 22334, emp);

        System.out.println(fun);

        System.out.println(fun.registrarHoraExtra(10) ? "\nSalário atualizado: " + String.format("%.2f", fun.getSalario()) +
                "\nTotal de horas extras: " + fun.getHorasExtras() + "\nCargo do funcionário: " + fun.getCargo(): "\nOperação não realizada");

        System.out.println(fun.registrarHoraExtra(20) ? "\nSalário atualizado: " + String.format("%.2f", fun.getSalario()) +
                "\nTotal de horas extras: " + fun.getHorasExtras() + "\nCargo do funcionário: " + fun.getCargo(): "\nOperação não realizada");

        System.out.println(fun.registrarHoraExtra(18) ? "\nSalário atualizado: " + String.format("%.2f", fun.getSalario()) +
                "\nTotal de horas extras: " + fun.getHorasExtras() + "\nCargo do funcionário: " + fun.getCargo(): "\nOperação não realizada");

    }
}
