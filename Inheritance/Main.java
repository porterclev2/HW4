package Inheritance;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SalariedEmployee("Joe", "Jones", 111111111, 2500.00),
            new HourlyEmployee("Stephanie", "Smith", 222222222, 25.00, 32),
            new HourlyEmployee("Mary", "Quinn", 333333333, 19.00, 47),
            new Employee("Nicole", "Dior", 444444444),
            new SalariedEmployee("Renwa", "Chanel", 555555555, 1700.00),
            new Employee("Mike", "Davenport", 666666666),
            new Employee("Mahnaz", "Vaziri", 777777777)
        };

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
