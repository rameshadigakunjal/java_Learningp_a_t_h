package AdvanceStage.LamdaExpression;

//import java.util.Collection;
import java.util.*;

public class LambdaComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
  //Collections.sort(names, String::compareTo);


}
    

}
