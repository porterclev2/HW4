package Polymorphism;

public class Main {

    static Ship[] ships = new Ship[3];
    
    public static void main(String[] args) {

        ships[0] = new Ship("S.S. Jade", "1999");
        ships[1] = new CruiseShip("Nevermore", "2020", 20);
        ships[2] = new CargoShip("S.S. Heavy LD", "2026", 2000);

        for (Ship s : ships) {
            s.print();
        }
    }
}
