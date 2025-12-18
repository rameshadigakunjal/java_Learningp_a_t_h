package FoundationStage.OOPSCOncepts.Polymorphism;

class Payment {
    void Pay(double amount) {
        System.out.println("Payment of amount: " + amount);
    }
}
class CreditCardPayment extends Payment {
    @Override
    void Pay(double amount) {
        System.out.println("Credit Card Payment of amount: " + amount);
    }
}
class UPIpayment extends Payment {
    @Override
    void Pay(double amount) {
        System.out.println("UPI Payment of amount: " + amount);
    }
}
class NetBankingPayment extends Payment {
    @Override
    void Pay(double amount) {
        System.out.println("Net Banking Payment of amount: " + amount);
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.Pay(15000.00);

        p=new UPIpayment();
        p.Pay(2000.00);

        p=new NetBankingPayment();
        p.Pay(5000.00);


    }
}


/*concepts are used:
--------------------
    1.Runtime Polymorphism (Method Overriding)
    2.Parent class Refference   */