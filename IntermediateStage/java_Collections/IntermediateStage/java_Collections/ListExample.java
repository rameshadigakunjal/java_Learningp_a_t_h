package IntermediateStage.java_Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        
        List<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate entry
        System.out.println("Fruits List: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));

        for(String f: fruits){
            System.out.println("Fruit: " + f);
        }
    } 
}
