package IntermediateStage.java_Collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("car");
        ll.add("bike");
        ll.add("bus");
        ll.add("Train");

        System.out.println("Linked List: "+ ll);

        ll.removeLast();
        System.out.println("After removing last element: " + ll);
        
    }
}
