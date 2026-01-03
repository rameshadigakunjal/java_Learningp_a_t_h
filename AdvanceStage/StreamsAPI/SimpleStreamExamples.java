package AdvanceStage.StreamsAPI;

/*collection.stream()
          .filter()
          .map()
          .sorted()
          .collect();
*/
import java.util.*;
public class SimpleStreamExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2, 7);

        numbers.stream()
                .filter(n->n % 2 == 0) // 
                //.forEach(System.out::println); // 2 8
                .forEach(x->System.out.println(x));
    }   
} 
