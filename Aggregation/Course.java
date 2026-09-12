package Aggregation;

public class Course {
    private String name;
    private Instructor instructor1;
    private Instructor instructor2;
    private Textbook textbook1;
    private Textbook textbook2;

    public Course(String n, String inst1_first, String inst1_last, String inst1_office, 
                    String inst2_first, String inst2_last, String inst2_office, 
                    String book1_title, String book1_author, String book1_publisher, 
                    String book2_title, String book2_author, String book2_publisher) {
        this.name = n;
        this.instructor1 = new Instructor(inst1_first, inst1_last, inst1_office);
        this.textbook1 = new Textbook(book1_title, book1_author, book1_publisher);

        this.instructor2 = new Instructor(inst2_first, inst2_last, inst2_office);
        this.textbook2 = new Textbook(book2_title, book2_author, book2_publisher);
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public Instructor getInstructor1() {
        return this.instructor1;
    }

    public Instructor getInstructor2() {
        return this.instructor2;
    }

    public Textbook getTextbook1() {
        return this.textbook1;
    }

    public Textbook getTextbook2() {
        return this.textbook2;
    }

    public void print() {
        System.out.printf("Course: %s\n", this.name);
        System.out.printf("Instructor: %s %s; Textbook: %s by %s\n", this.instructor1.getFirstName(), 
                            this.instructor1.getLastName(), this.textbook1.getTitle(), this.textbook1.getAuthor());
        System.out.printf("Instructor: %s %s; Textbook: %s by %s\n", this.instructor2.getFirstName(), 
                            this.instructor2.getLastName(), this.textbook2.getTitle(), this.textbook2.getAuthor());
    }
}
