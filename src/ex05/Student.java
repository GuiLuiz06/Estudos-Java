package ex05;

public class Student {

    public String Name;
    public double notaA;
    public double notaB;
    public double notaC;

    public double NotaTotal() {
        return notaA + notaB + notaC;
    }

    public double Final() {
        if (NotaTotal() < 60.0) {
            return 60.0 - NotaTotal();
        }
        else {
            return NotaTotal();
        }
    }

}
