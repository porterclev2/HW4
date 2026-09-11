package Inheritance;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("Joe", "Jones", 111111111, 2500),
            new HourlyEmployee("Stephanie", "Smith", 222222222, 25, 32),
            new HourlyEmployee("Mary", "Quinn", 333333333, 19, 47),
            new CommissionEmployee("Nicole", "Dior", 444444444, 0.15, 50000),
            new SalariedEmployee("Renwa", "Chanel", 555555555, 1700),
            new BaseEmployee("Mike", "Davenport", 666666666, 95000),
            new CommissionEmployee("Mahnaz", "Vaziri", 777777777, 0.22, 40000)
        };

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
