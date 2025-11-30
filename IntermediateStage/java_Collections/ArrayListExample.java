package IntermediateStage.java_Collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); // Duplicate entry

        System.out.println("Colors List: " + colors);

        colors.remove("Green");
        System.out.println("After removing Green: " + colors);  
        for (String color : colors) {
            System.out.println("Color: " + color);
        }   
        System.out.println("Element at index 1: " + colors.get(1)  );


        
        
    }
    
}
