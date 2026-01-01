package AdvanceStage.LamdaExpression;

import java.util.function.Predicate;

public class BuiltInFunction {

    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // true
        System.out.println("Is 5 even? " + isEven.test(5)); // false
    }
}