package Agregacao.ex01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aula {

    private static Integer idContadorAula = 0;
    private Integer idAula;
    private String objetivo;
    private LocalDate data;
    private ArrayList<Recurso> recursos;

    public Aula(String objetivo, LocalDate data) {
        this.idAula = idContadorAula;
        idContadorAula++;
        this.objetivo = objetivo;
        this.data = data;
        this.recursos = new ArrayList<>();
    }

    public boolean adicionarRecurso(Recurso r) {
        recursos.add(r);
        return true;
    }

    public boolean removerRecurso(Recurso r) {
        this.recursos.remove(r);
        return true;
    }

    public Integer getIdAula() {
        return idAula;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public LocalDate getData() {
        return data;
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    @Override
    public String toString() {

        String textoRecursos = "";

        if (recursos.isEmpty()) {

            textoRecursos = "Nenhum recurso";

        } else {

            for (Recurso r : recursos) {
                textoRecursos += "\n" + r + "\n";
            }

        }

        return "Aula       :   " +
                "\nidAula     :   " + idAula +
                "\nobjetivo   :   " + objetivo +
                "\ndata       :   " + data +
                "\nrecursos   :   " + textoRecursos + "\n";
    }
}
