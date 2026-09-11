package Interface;

public class Freelancer implements Payable {
    static final double OT_THRESHOLD = 40.0;
    static final double OT_MULTIPLIER = 1.5;

    String first_name;
    String last_name;
    double hourly_rate;
    double hours_worked;

    public Freelancer(String f, String l, double hr, double hw) {
        this.first_name = f;
        this.last_name = l;
        setHourlyRate(hr);
        setHoursWorked(hw);
    }

    public void setFirstName(String f) {
        this.first_name = f;
    }

    public void setLastName(String l) {
        this.last_name = l;
    }

    public void setHourlyRate(double hr) {
        if (hr < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative: " + hr);
        }
        this.hourly_rate = hr;
    }

    public void setHoursWorked(double hw) {
        if (hw < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative: " + hw);
        }
        this.hours_worked = hw;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public double getHourlyRate() {
        return this.hourly_rate;
    }

    public double getHoursWorked() {
        return this.hours_worked;
    }

    @Override
    public String getPayeeName() {
        return this.first_name + " " + this.last_name;
    }

    @Override
    public double calculatePayment() {
        if (this.hours_worked <= OT_THRESHOLD) {
            return this.hourly_rate * this.hours_worked;
        }
        double overtime_hours = this.hours_worked - OT_THRESHOLD;
        return this.hourly_rate *OT_THRESHOLD 
            + this.hourly_rate * OT_MULTIPLIER * overtime_hours;
    }

    @Override
    public void print() {
        System.out.printf("Freelancer: %s | payment: $%.2f%n", getPayeeName(), calculatePayment());
    }
}
