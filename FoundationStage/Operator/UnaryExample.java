package FoundationStage.Operator;

public class UnaryExample {
    public static void main(String[] args) {
          int a = 5;

        System.out.println(a++);  // 5 (then a becomes 6)
        System.out.println(++a);  // 7
        System.out.println(a--);  // 7 (then 6)
        System.out.println(--a);  // 5
    }
}
