package AdvanceStage.LamdaExpression;

interface InnerMultipleParameter {
    int sum(int a, int b) ;

    
}
public class MultipleParameter {
    public static void main(String[] args) {
        InnerMultipleParameter obj = (a, b) -> a + b;
        System.out.println("Sum is: " + obj.sum(5, 10));
    }
}
