

import java.util.Scanner;

public class InputOutputExample {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter two numbers separated by space: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println("\n------ OUTPUT ------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage);
        System.out.println("Gender: " + gender);
        System.out.println("Student: " + isStudent);

        System.out.print("Array elements: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("\nSum of " + a + " and " + b + " = " + sum);
    }
}
