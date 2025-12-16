package FoundationStage.OOPSCOncepts;

class Bank{
    int accountNumber;
    double balance;

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void showBalance(){
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
public class BankExampleForClassAndObject {
 public static void main(String[] args) {
    Bank myAccount = new Bank();
    myAccount.accountNumber = 123456;
    myAccount.balance = 1000.0;

    myAccount.showBalance();
    myAccount.deposit(500.0);
    myAccount.showBalance();
 }   
}
