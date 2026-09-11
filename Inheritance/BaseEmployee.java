package Inheritance;
public class BaseEmployee extends Employee {
    int base_salary;

    public BaseEmployee(String f, String l, int sn, int bs) {
        super(f, l, sn);
        this.base_salary = bs;
    }

    public void setBaseSalary(int bs) {
        this.base_salary = bs;
    }

    public int getBaseSalary() {
        return this.base_salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | base salary: $%d", this.base_salary);
    }
}
