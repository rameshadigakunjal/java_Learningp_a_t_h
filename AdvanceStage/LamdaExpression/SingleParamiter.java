package AdvanceStage.LamdaExpression;

interface Square {
    int calculate(int x);
}
public class SingleParamiter {
    public static void main(String[] args) {
        Square s = x-> x*x;
        System.out.println("Square of 5 is: " + s.calculate(5));
    }
}
