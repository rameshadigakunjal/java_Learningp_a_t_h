package IntermediateStage.Generics;

//2 . Write a program to demonstrate the use of Generics with Set collection.
import java.util.HashSet;
import java.util.Set;

public class GenericsSetExample {
    public static void main(String[] args) {
        Set<Integer> num  = new HashSet<>();
        num.add(10);
        num.add(20);    
        num.add(30);
        num.add(40);

        for(Integer n: num){
            System.out.println(n);
        }
    }
}
