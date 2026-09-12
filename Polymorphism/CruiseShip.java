package Polymorphism;

public class CruiseShip extends Ship {
    int max_passengers;

    public CruiseShip(String n, String yb, int mp) {
        super(n, yb);
        this.max_passengers = mp;
    }

    public void setMaxPassengers(int mp) {
        this.max_passengers = mp;
    }

    public int getMaxPassengers() {
        return this.max_passengers;
    }

    @Override
    public void print() {
        System.out.printf("Cruise ship: %s | max passengers: %d%n", this.name, this.max_passengers);
    }
}
