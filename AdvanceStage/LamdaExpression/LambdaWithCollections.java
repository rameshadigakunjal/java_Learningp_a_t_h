package AdvanceStage.LamdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaWithCollections {

    public static void main(String[] args) {
                List<String> names = Arrays.asList("Ramesh", "Anil", "Suresh");

        names.forEach(name -> System.out.println(name));
    }
}