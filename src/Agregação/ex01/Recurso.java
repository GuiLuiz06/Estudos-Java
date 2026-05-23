package Agregação.ex01;

public class Recurso {

    private static Integer idRecurso = 1000;
    private Integer id;
    private String descricao;
    private char tipo;

    public Recurso(String descricao, char tipo) {
        this.id = idRecurso;
        idRecurso++;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getTipo() {
        return tipo;
    }

    public static Integer getIdRecurso() {
        return idRecurso;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  "\nRecurso    :   " +
                "\nid         :   " + id +
                "\ndescricao  :   " + descricao +
                "\ntipo       :   " + tipo;
    }
}
