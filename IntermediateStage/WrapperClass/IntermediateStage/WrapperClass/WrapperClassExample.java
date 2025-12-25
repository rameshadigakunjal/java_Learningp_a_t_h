package IntermediateStage.WrapperClass;


import java.util.ArrayList;

public class WrapperClassExample {

    public static void main(String[] args) {
        
        System.out.println("--- 1. Auto-Boxing (Primitive to Object) ---");
        
        // Primitive variable
        int rollNoPrimitive = 101;
        
        // Auto-BOXING: Java converts 'int' (primitive) to 'Integer' (wrapper object).
        Integer rollNoWrapper = rollNoPrimitive; 
        
        System.out.println("Primitive Value: " + rollNoPrimitive);
        System.out.println("Wrapper Object: " + rollNoWrapper);
        
        // Use a Wrapper object method (proof it's an object)
        System.out.println("Binary representation: " + rollNoWrapper.toBinaryString(rollNoWrapper));
        
        // --- 2. Auto-Unboxing (Object to Primitive) ---
        
        System.out.println("\n--- 2. Auto-Unboxing (Object to Primitive) ---");
        
        // Wrapper object
        Double wrapperPrice = new Double(19.99); // Double is the wrapper for double.
        
        // Auto-UNBOXING: Java converts 'Double' (wrapper object) back to 'double' (primitive).
        double primitivePrice = wrapperPrice;
        
        // Use the primitive in an arithmetic operation
        double discountedPrice = primitivePrice * 0.8; 
        
        System.out.println("Original Wrapper Price: " + wrapperPrice);
        System.out.println("Discounted Primitive Price: " + discountedPrice);
        
        // --- 3. Wrappers in Collections (The primary use case) ---
        
        System.out.println("\n--- 3. Wrappers in Collections ---");
        
        // ArrayList must store objects, so we use Integer (Wrapper) instead of int (primitive).
        ArrayList<Integer> scores = new ArrayList<>(); 
        
        // Auto-BOXING occurs for each primitive 'int' added to the list.
        scores.add(95); 
        scores.add(88);
        
        System.out.println("List of scores: " + scores);
        
        // When retrieving an element and adding, both boxing and unboxing occur:
        // scores.get(0) returns Integer, which is auto-unboxed to int for the addition.
        int total = scores.get(0) + scores.get(1); 
        
        System.out.println("Total (auto-unboxed addition): " + total);
    }
}
