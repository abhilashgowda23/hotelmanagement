package hotelmanagement.payment;

public class CashPayment implements Payment {
    @Override
    public boolean processPayment(double amount) {
        // enable cash payment
        return true;
    }
}
