package AdvanceStage.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate <Integer> isPositive = number -> number > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5)); // true
        System.out.println("Is -3 positive? " + isPositive.test(-3)); // false
    }
}
