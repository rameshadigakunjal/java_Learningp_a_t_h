package AdvanceStage.Multithreading;

class BankAccount {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        // synchronize to prevent simultaneous withdrawals from corrupting balance
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance = balance - amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Customer extends Thread {
    BankAccount account;

    Customer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(700);
    }
}



public class SyncronizationBankrexample {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        Customer c1 = new Customer(acc);
        Customer c2 = new Customer(acc);

        c1.setName("Customer-1");
        c2.setName("Customer-2");

        c1.start();
        c2.start();
    }
}
