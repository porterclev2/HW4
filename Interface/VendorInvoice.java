package Interface;

public class VendorInvoice implements Payable {
    String vendor_name;
    String invoice_number;
    double amount_due;

    public VendorInvoice(String vn, String in, double ad) {
        this.vendor_name = vn;
        this.invoice_number = in;
        setAmountDue(ad);
    }

    public void setVendorName(String vn) {
        this.vendor_name = vn;
    }

    public void setInvoiceNumber(String in) {
        this.invoice_number = in;
    }

    public void setAmountDue(double ad) {
        if (ad < 0) {
            throw new IllegalArgumentException("Amount due cannot be negative: " + ad);
        }
        this.amount_due = ad;
    }

    public String getVendorName() {
        return this.vendor_name;
    }

    public String getInvoiceNumber() {
        return this.invoice_number;
    }

    public double getAmountDue() {
        return this.amount_due;
    }

    @Override
    public String getPayeeName() {
        return this.vendor_name;
    }

    @Override
    public double calculatePayment() {
        return this.amount_due;
    }

    @Override
    public void print() {
        System.out.printf("Vendor: %s | invoice #%s | payment: $%.2f%n",
            getPayeeName(), this.invoice_number, calculatePayment());
    }
}
