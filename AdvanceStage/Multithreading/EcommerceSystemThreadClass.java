
//E-Commerce Order Processing System
class orderConfirmation extends Thread {
    orderConfirmation(){
        super("Order Confirmation Thread");
    }
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " is Confirming the order...");
            Thread.sleep(2000);
            System.out.println("Order Confirmed Successfully!");
        } catch (InterruptedException e) {
            System.out.println("Order confirmation interrupted.");
        }
    }
}
class PaymentProcessing extends Thread {
    PaymentProcessing(){
        super("Payment Processing Thread");
    }
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " is Processing the payment...");
            Thread.sleep(3000);
            System.out.println("Payment Processed Successfully!");
        } catch (InterruptedException e) {
            System.out.println("Payment processing interrupted.");
        }
    }
}

class InventoryUpdate extends Thread {
    InventoryUpdate(){
        super("Inventory Update Thread");
    }
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName() + " is Updating the inventory...");
            Thread.sleep(2500);
            System.out.println("Inventory Updated Successfully!");
        } catch (InterruptedException e) {
            System.out.println("Inventory update interrupted.");
        }
    }
}
public class EcommerceSystemThreadClass {
    public static void main(String[] args) {
        System.out.println("The main thread is starting the E-Commerce Order Processing System...");
        orderConfirmation t1 = new orderConfirmation();
        PaymentProcessing t2 = new PaymentProcessing();
        InventoryUpdate t3 = new InventoryUpdate();

        t1.start();
        t2.start(); 
        t3.start();

        System.out.println("The main thread user notified");
    }
}