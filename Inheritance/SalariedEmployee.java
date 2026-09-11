package Inheritance;
public class SalariedEmployee extends Employee {
    int weekly_salary;

    public SalariedEmployee(String f, String l, int sn, int ws) {
        super(f, l, sn);
        this.weekly_salary = ws;
    }

    public void setWeeklySalary(int ws) {
        this.weekly_salary = ws;
    }

    public int getWeeklySalary() {
        return this.weekly_salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | weekly salary: $%d", this.weekly_salary);
    }
}
