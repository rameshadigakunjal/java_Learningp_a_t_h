package IntermediateStage.Exception;

public class ATM_Custom_Exception {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawAmount = 7000;

        try{
            if(withdrawAmount > balance) {
                throw new Exception("Withdrawal amount exceeds available balance.");
            }
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
        catch(Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for using our ATM service.");
        }
    }
}
