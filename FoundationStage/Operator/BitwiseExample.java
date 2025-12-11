package FoundationStage.Operator;

public class BitwiseExample {
    public static void main(String[] args) {
      
        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println(a & b);  // 1
        System.out.println(a | b);  // 7
        System.out.println(a ^ b);  // 6
        System.out.println(a << 1); // 10
        System.out.println(a >> 1); // 2
    }
}
