package Aggregation;

public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String n, String inst_first, String inst_last, String inst_office, String book_title, String book_author, String book_publisher) {
        this.name = n;
        this.instructor = new Instructor(inst_first, inst_last, inst_office);
        this.textbook = new Textbook(book_title, book_author, book_publisher);
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public Textbook getTextbook() {
        return this.textbook;
    }

    public void print() {
        System.out.printf("Course: %s\n", this.name);
        System.out.printf("Instructor: %s %s\n", this.instructor.getFirstName(), this.instructor.getLastName());
        System.out.printf("Textbook: %s by %s\n", this.textbook.getTitle(), this.textbook.getAuthor());
    }
}
