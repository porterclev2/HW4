package Inheritance;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Joe", "Jones", 111111111),
            new Employee("Stephanie", "Smith", 222222222),
            new Employee("Mary", "Quinn", 333333333),
            new Employee("Nicole", "Dior", 444444444),
            new Employee("Renwa", "Chanel", 555555555),
            new Employee("Mike", "Davenport", 666666666),
            new Employee("Mahnaz", "Vaziri", 777777777)
        };

        for (Employee emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSocialSecurityNumber());
        }
    }
}
