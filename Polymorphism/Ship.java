package Polymorphism;

public class Ship {
    String name;
    String year_built;

    public Ship(String n, String yb) {
        this.name = n;
        this.year_built = yb;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setYearBuilt(String yb) {
        this.year_built = yb;
    }

    public String getName() {
        return this.name;
    }

    public String getYearBuilt() {
        return this.year_built;
    }

    public void print() {
        System.out.printf("Ship: %s | year built: %s%n", this.name, this.year_built);
    }
}
