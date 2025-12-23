package AdvanceStage.Multithreading;
//Hotel Management System using Runnable Interface

class RoomCleaningTask implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is Cleaning the room...");
            Thread.sleep(2000);
            System.out.println("Room cleaned successfully!");
        } catch (InterruptedException e) {
            System.out.println("Room cleaning interrupted.");
        }
    }
}
class FoodOrderTask implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is Processing the food order...");
            Thread.sleep(3000);
            System.out.println("Food order processed successfully!");
        } catch (InterruptedException e) {
            System.out.println("Food order processing interrupted.");
        }
    }
}
class BillingTask implements Runnable {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is Generating the bill...");
            Thread.sleep(2500);
            System.out.println("Bill generated successfully!");
        } catch (InterruptedException e) {
            System.out.println("Billing interrupted.");
        }
    }
}
public class HotelManagementSystemRunnableInterface {
    public static void main(String[] args) {
        System.out.println("The main thread is starting the Hotel Management System...");

        Thread cleaningThread = new Thread(new RoomCleaningTask(), "Room Cleaning Thread");
        Thread foodOrderThread = new Thread(new FoodOrderTask(), "Food Order Thread");
        Thread billingThread = new Thread(new BillingTask(), "Billing Thread");

        cleaningThread.start();
        foodOrderThread.start();
        billingThread.start();

        System.out.println("The main thread user notified");
    }
}
