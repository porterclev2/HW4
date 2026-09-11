package Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        payables.add(new Freelancer("Ben", "Dover", 12.00, 40.0));
        payables.add(new Freelancer("Mike", "Soap", 23.50, 60.0));
        payables.add(new VendorInvoice("Good Vendor", "1234", 1253.99));
        payables.add(new VendorInvoice("Great Vendor", "5678", 867.97));

        double total_payout = 0.0;

        for (Payable p : payables) {
            p.print();
            total_payout += p.calculatePayment();
        }

        System.out.printf("Total payout for the period: $%.2f%n", total_payout);
    }
}
