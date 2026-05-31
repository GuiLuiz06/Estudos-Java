package Herança.aula01;

public class BusinessAcount extends Account {

    private Double loanlimit;

    public BusinessAcount() {
        super();
    }

    public BusinessAcount(Integer number, String holder, Double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan(Double amount) {
        if (amount <= loanlimit) {
            balance += amount - 10.0;
        }
    }
}
