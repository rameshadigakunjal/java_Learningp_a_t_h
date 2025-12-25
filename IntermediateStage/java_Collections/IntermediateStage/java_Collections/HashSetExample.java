package IntermediateStage.java_Collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Duplicate entry
        System.out.println("HashSet: " + set);

        set.remove("Banana");
        System.out.println("After removing Banana: " + set);
        

    }
    
}
