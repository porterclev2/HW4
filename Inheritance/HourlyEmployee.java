package Inheritance;
public class HourlyEmployee extends Employee {
    int wage;
    int hours_worked;

    public HourlyEmployee(String f, String l, int sn, int w, int hw) {
        super(f, l, sn);
        this.wage = w;
        this.hours_worked = hw;
    }

    public void setWage(int w) {
        this.wage = w;
    }

    public void setHoursWorked(int hw) {
        this.hours_worked = hw;
    }

    public int getWage() {
        return this.wage;
    }

    public int getHoursWorked() {
        return this.hours_worked;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | wage: $%d | hours worked: %d", this.wage, this.hours_worked);
    }
}
