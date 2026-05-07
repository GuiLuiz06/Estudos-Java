package RelacionamentoEntreClassesAssociação.ex01;

public class Livro {

    private int idLivro;
    private String titulo;
    private String assunto;

    public Livro(int idLivro, String titulo, String assunto) {
        this.idLivro = idLivro;
        this.assunto = assunto;
        this.titulo = titulo;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
