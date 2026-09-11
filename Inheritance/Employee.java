package Inheritance;
public class Employee {
    String first_name;
    String last_name;
    int social_num;

    public Employee(String f, String l, int sn) {
        this.first_name = f;
        this.last_name = l;
        this.social_num = sn;
    }

    public void setFirstName(String f) {
        this.first_name = f;
    }

    public void setLastName(String l) {
        this.last_name = l;
    }

    public void setSocialNum(int sn) {
        this.social_num = sn;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public int getSocialSecurityNumber() {
        return this.social_num;
    }

    @Override
    public String toString() {
        return this.first_name + " " + this.last_name + " (SSN: " + this.social_num + ")";
    }
}