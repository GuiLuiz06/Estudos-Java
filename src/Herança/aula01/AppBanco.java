package Herança.aula01;

public class AppBanco {
    public static void main(String[] args) {

        Account ac = new Account(1001, "Alex", 0.0);

        BusinessAcount ba = new BusinessAcount(1002, "Maria", 0.0, 500.0);

        // UPCASTING - ATRIBUIÇÃO DE UM OBJETO A OUTRO

        Account acc1 = ba;
        Account acc2 = new BusinessAcount(1003, "Guilherme", 0.0, 200.0);
        Account acc3 = new SavesAcount(1004, "Ana", 0.0, 100.0);

        // DOWNCASTING
        BusinessAcount acc4 = (BusinessAcount) acc2;
        acc4.loan(100.0);

        // Erro de conversão pois a acc3 é da clase SavesAcount.
        // BusinessAcount acc5 = (BusinessAcount) acc3;

        if (acc3 instanceof BusinessAcount) {
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavesAcount) {
            SavesAcount acc5 = (SavesAcount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
