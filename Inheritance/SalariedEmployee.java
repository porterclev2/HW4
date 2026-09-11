package Inheritance;
public class SalariedEmployee extends Employee {
    double weekly_salary;

    public SalariedEmployee(String f, String l, int sn, double ws) {
        super(f, l, sn);
        this.weekly_salary = ws;
    }

    public void setWeeklySalary(double ws) {
        this.weekly_salary = ws;
    }

    public double getWeeklySalary() {
        return this.weekly_salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | weekly salary: $%.2f", this.weekly_salary);
    }
}
