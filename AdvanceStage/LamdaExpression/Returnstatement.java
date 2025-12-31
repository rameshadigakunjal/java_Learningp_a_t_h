package AdvanceStage.LamdaExpression;
interface Multiply {
    int multiply(int a, int b);
}

public class Returnstatement {
    public static void main(String[] args) {
        Multiply m = (a, b) -> {
            return a * b;
        };
        System.out.println(m.multiply(4, 5)); // 20
}
}
