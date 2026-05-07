package RelacionamentoEntreClassesAssociação.ex02;

public class Pneu {

    private int idPneu;
    private String modelo;
    private double indiceDeVida;
    private char estado;
    private int horasDeUso;
    private Fabricante fabricante;

    public Pneu(double indiceDeVida, String modelo, int idPneu, Fabricante fabricante) {
        this.indiceDeVida = indiceDeVida;
        this.modelo = modelo;
        this.idPneu = idPneu;
        this.estado = 'N';
        this.fabricante = fabricante;
    }

    public boolean desgastar(int horaInicial, int horaFinal) {
        if (estado == 'N' || estado == 'U') {
            int minutos = (horaFinal - horaInicial) * 60;
            double desgaste = minutos * 0.12345;
            if (estado == 'N') {
                estado = 'U';
            }
            indiceDeVida -= desgaste;
            if (indiceDeVida <= 0) {
                estado = 'F';
            }
            horasDeUso = minutos;
            return true;
        }
        return false;
    }

    public int getIdPneu() {
        return idPneu;
    }

    public String getModelo() {
        return modelo;
    }

    public double getIndiceDeVida() {
        return indiceDeVida;
    }

    public char getEstado() {
        return estado;
    }

    public int getHorasDeUso() {
        return horasDeUso;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  "Pneu            :   " +
                "\nIdPneu          :   " + idPneu +
                "\nModelo          :   " + modelo +
                "\nIndice De Vida  :   " + indiceDeVida +
                "\nEstado          :   " + estado +
                "\nHoras De Uso    :   " + horasDeUso +
                "\n" + fabricante;
    }
}
