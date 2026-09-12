package Aggregation;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Best Course Ever", 
                                   "John", 
                                   "Pork", 
                                   "3-2636", 
                                   "Clean Code", 
                                   "George Orwell", 
                                   "ACME"
                                );

        course.print();
    }
}
