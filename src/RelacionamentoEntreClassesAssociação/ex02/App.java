package RelacionamentoEntreClassesAssociação.ex02;

import java.util.Locale;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Fabricante fab = new Fabricante("3334542543-343", "Autocar Gui", "carros");
        Pneu pne = new Pneu(110.0, "Traker", 2245, fab);

        System.out.println(pne);

        System.out.println(pne.desgastar(4, 14) ? "\nIndice de vida: " + String.format("%.2f", pne.getIndiceDeVida()) + "\nHoras de uso: " + pne.getHorasDeUso() + "\nEstado do pneu: " + pne.getEstado(): "\nPneu fora de uso");
        System.out.println(pne.desgastar(15, 20) ? "\nIndice de vida: " + String.format("%.2f", pne.getIndiceDeVida()) + "\nHoras de uso: " + pne.getHorasDeUso() + "\nEstado do pneu: " + pne.getEstado(): "\nPneu fora de uso");
        System.out.println(pne.desgastar(21, 23) ? "\nIndice de vida: " + String.format("%.2f", pne.getIndiceDeVida()) + "\nHoras de uso: " + pne.getHorasDeUso() + "\nEstado do pneu: " + pne.getEstado(): "\nPneu fora de uso");



    }

}
