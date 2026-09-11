package Inheritance;
public class CommissionEmployee extends Employee {
    double commission_rate;
    int gross_sales;

    public CommissionEmployee(String f, String l, int sn, double cr, int gs) {
        super(f, l, sn);
        this.commission_rate = cr;
        this.gross_sales = gs;
    }

    public void setCommissionRate(int cr) {
        this.commission_rate = cr;
    }

    public void setGrossSales(int gs) {
        this.gross_sales = gs;
    }

    public double getCommissionRate() {
        return this.commission_rate;
    }

    public int getGrossSales() {
        return this.gross_sales;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | commission rate: %.0f%% | gross sales: $%d",
            this.commission_rate * 100, this.gross_sales);
    }
}
