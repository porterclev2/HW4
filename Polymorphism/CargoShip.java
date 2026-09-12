package Polymorphism;

public class CargoShip extends Ship {
    int cargo_capacity;

    public CargoShip(String n, String yb, int cc) {
        super(n, yb);
        this.cargo_capacity = cc;
    }

    public void setCargoCapacity(int cc) {
        this.cargo_capacity = cc;
    }

    public int getCargoCapacity() {
        return this.cargo_capacity;
    }

    @Override
    public void print() {
        System.out.printf("Cargo ship: %s | cargo capacity: %d tons%n", this.name, this.cargo_capacity);
    }
}
