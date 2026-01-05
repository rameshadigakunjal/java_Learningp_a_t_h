package AdvanceStage.Annotations;
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
public class FunctionInterface {
    public static void main(String[] args) {
        Calculator calc = (a, b) -> a + b;
        int result = calc.add(5, 10);
        System.out.println("Sum: " + result);
    }
}
