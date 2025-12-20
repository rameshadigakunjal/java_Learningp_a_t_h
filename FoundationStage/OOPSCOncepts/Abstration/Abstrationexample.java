package FoundationStage.OOPSCOncepts.Abstration;

// Abstract class
abstract class Payment {
    abstract void processPayment(double amount);

    void paymentSuccess() {
        System.out.println("Payment completed successfully");
    }
}

// Credit Card Payment
class CreditCardPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }
}

// UPI Payment
class UPIPayment extends Payment {
    void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

public class Abstrationexample {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.processPayment(5000);
        p.paymentSuccess();

        p = new UPIPayment();
        p.processPayment(1200);
        p.paymentSuccess();
    }
}

