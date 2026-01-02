package AdvanceStage.FunctionalInterface;
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
    // int subtract(int x, int y);
}
public class CustomFunctionalInterface {
    public static void main(String[] args) {
        Calculator c = (a, b) -> a + b;
        System.out.println("Addition: " + c.add(5, 3)); // Addition: 8
        // Calculator c2=(x, y) -> x - y;
        // System.out.println("Subtraction: " + c2.subtract(5, 3)); // Subtraction: 2

    }
}
