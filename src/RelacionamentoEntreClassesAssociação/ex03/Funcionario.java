package RelacionamentoEntreClassesAssociação.ex03;

public class Funcionario {

    private int idFuncionario;
    private String nome;
    private double salario;
    private char cargo;
    private int horasExtras;
    private Empresa empresa;

    public Funcionario(char cargo, double salario, String nome, int idFuncionario, Empresa empresa) {
        this.cargo = cargo;
        this.salario = salario;
        this.nome = nome;
        this.idFuncionario = idFuncionario;
        this.empresa = empresa;
    }

    public boolean registrarHoraExtra(int quantidadeDeHoras) {
        if (cargo == 'D') {
            return false;
        } else {
            if (quantidadeDeHoras <= 0) {
                return false;
            }
        }
        double valorHoraExtra = (salario / 220) * 1.5;
        double somaSalario = valorHoraExtra * quantidadeDeHoras;
        salario += somaSalario;
        horasExtras += quantidadeDeHoras;

        if (horasExtras > 44) {
            cargo = 'S';
        }
        return true;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public char getCargo() {
        return cargo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario    :   " +
                "\nidFuncionario  :   " + idFuncionario +
                "\nnome           :   " + nome +
                "\nsalario        :   " + salario +
                "\ncargo          :   " + cargo +
                "\nhoras Extras   :   " + horasExtras +
                "\n" + empresa;
    }
}
