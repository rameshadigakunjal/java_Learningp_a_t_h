

class BankAccount{
    private String accountNumber;
    private double balance;
    private String accountHolderName;


    public BankAccount(String accountNumber, String accountHolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if(initialBalance >= 0){
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }


    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Alice Smith", 5000.0);

        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(2000);
        account.withdraw(3000);
    }

}