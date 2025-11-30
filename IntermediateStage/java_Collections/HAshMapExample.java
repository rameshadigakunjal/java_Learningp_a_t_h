package IntermediateStage.java_Collections;

import java.util.HashMap;

public class HAshMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        System.out.println("HashMap: " + map);

        map.remove(2);

        System.out.println("After removing key 2: " + map);
    }
}
