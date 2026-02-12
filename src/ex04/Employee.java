package ex04;

public class Employee {

    public String Name;
    public double GrossSalary;
    public double tax;

    public double NetSalary() {
        return GrossSalary - tax;
    }
    public void IncreaseSalary(double percentage) {
        GrossSalary += GrossSalary / 100.0 * percentage;
    }

    public String toString() {
        return Name + ", $ " + String.format("%.2f", NetSalary());
    }
}
