package RelacionamentoEntreClassesAssociação.ex02;

public class Fabricante {

    private String cnpf;
    private String nomeFantasia;
    private String razaoSocial;

    public Fabricante(String cnpf, String nomeFantasia, String razaoSocial) {
        this.cnpf = cnpf;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpf() {
        return cnpf;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Nome Fantasia   :   " + nomeFantasia;
    }
}
