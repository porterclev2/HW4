package Inheritance;
public class HourlyEmployee extends Employee {
    double wage;
    double hours_worked;

    public HourlyEmployee(String f, String l, int sn, double w, double hw) {
        super(f, l, sn);
        this.wage = w;
        this.hours_worked = hw;
    }

    public void setWage(double w) {
        this.wage = w;
    }

    public void setHoursWorked(double hw) {
        this.hours_worked = hw;
    }

    public double getWage() {
        return this.wage;
    }

    public double getHoursWorked() {
        return this.hours_worked;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | wage: $%.2f | hours worked: %.1f", this.wage, this.hours_worked);
    }
}
