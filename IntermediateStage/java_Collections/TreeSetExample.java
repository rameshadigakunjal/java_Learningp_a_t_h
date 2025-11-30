package IntermediateStage.java_Collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Orange");
        ts.add("Apple");
        ts.add("Banana");

        System.out.println("TreeSet (Sorted): " + ts);

        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());
    }
}
