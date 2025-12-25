package IntermediateStage.Generics;
//1. Write a program to demonstrate the use of Generics with List collection.
import java.util.ArrayList;
import java.util.List;

public class GenericListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ashok");
        names.add("vijay");
        names.add("sachin");

        for(String s: names){
            System.out.println(s);
        }   
    }
    
}
