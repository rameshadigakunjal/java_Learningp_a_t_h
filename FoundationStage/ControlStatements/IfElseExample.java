package FoundationStage.ControlStatements;

public class IfElseExample {
    public static void main(String[] args) {
        int num = 100;
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
