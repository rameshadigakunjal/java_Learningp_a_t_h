package IntermediateStage.java_Collections;
import java.util.*;


public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();

        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");
        studentMap.put(2, "David"); // Duplicate key, will overwrite Bob

        System.out.println("Student Map: " + studentMap);  
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
