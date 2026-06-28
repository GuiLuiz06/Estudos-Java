package Herança.aula01;

public class SavesAcount extends Account{

    private Double interestRate;

    public SavesAcount() {
        super();
    }

    public SavesAcount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
}
