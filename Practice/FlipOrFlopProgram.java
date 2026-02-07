package Practice;

import java.util.Scanner;

class FlipOrFlopException extends Exception {
    public FlipOrFlopException(String message) {
        super(message);
    }
}

public class FlipOrFlopProgram {
    public static void flipOrFlop(int input1, int[] input2, int input3)
            throws FlipOrFlopException {

        // Validation checks
        if (input1 < 0 || input1 >= input2.length) {
            throw new FlipOrFlopException("Index out of range");
        }

        if (input3 <= 0) {
            throw new FlipOrFlopException("input3 must be greater than 0");
        }

        // Logic
        if (input2[input1] % input3 == 0) {
            System.out.println("FLIP");
        } else {
            System.out.println("FLOP");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int input1 = sc.nextInt();          // index
            int n = sc.nextInt();               // array size
            int[] input2 = new int[n];

            for (int i = 0; i < n; i++) {
                input2[i] = sc.nextInt();
            }

            int input3 = sc.nextInt();           // divisor

            flipOrFlop(input1, input2, input3);

        } catch (FlipOrFlopException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }

}
