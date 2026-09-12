package Aggregation;

public class Instructor {
    private String first_name;
    private String last_name;
    private String office_number;

    public Instructor(String f, String l, String on) {
        this.first_name = f;
        this.last_name = l;
        this.office_number = on;
    }

    public void setFirstName(String f) {
        this.first_name = f;
    }

    public void setLastName(String l) {
        this.last_name = l;
    }

    public void setOfficeNumber(String on) {
        this.office_number = on;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getOfficeNumber() {
        return this.office_number;
    }
}
