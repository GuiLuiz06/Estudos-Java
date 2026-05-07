package SeparaçãoResponsabilidades.exercicios.ex07;

public class ClassificadorEtario {

    public int idade;

    public static String classificacao(int idade) {
        String msg;
        if (idade < 14) {
            msg = "Classificação: Criança.";
        } else if (idade >= 14 && idade < 18) {
            msg = "Classificação: Adolescente.";
        } else if (idade >= 18 && idade <= 60) {
            msg = "Classificação: Adulto.";
        } else {
            msg = "Classificação: Idoso.";
        }
        return msg;
    }

}
