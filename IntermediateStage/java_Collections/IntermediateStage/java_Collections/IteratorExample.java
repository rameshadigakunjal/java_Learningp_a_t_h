package IntermediateStage.java_Collections;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> itr = list.iterator();

        System.out.println("Using Iterator:");
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);

            if (element.equals("Python")) {
                itr.remove();  // remove element safely
            }
        }

        System.out.println("After removal: " + list);
    }
}
