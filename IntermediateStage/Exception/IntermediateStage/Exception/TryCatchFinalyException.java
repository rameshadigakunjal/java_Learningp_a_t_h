package IntermediateStage.Exception;
public class TryCatchFinalyException {
    public static void main(String[] args) {
        try{
             int a  = 10;
             int b = 0;
             System.out.println("Result: " + (a/b));
        }
        catch(ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: Division by zero is not allowed.");
        }
        finally {
            System.out.println("Execution of try-catch block is complete.");
        }
    }
    
}
