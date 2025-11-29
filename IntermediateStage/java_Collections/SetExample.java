package IntermediateStage.java_Collections;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10); // Duplicate entry
        numbers.add(30);
        numbers.add(20); // Duplicate entry

        System.out.println("Numbers Set: " + numbers);  
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}
