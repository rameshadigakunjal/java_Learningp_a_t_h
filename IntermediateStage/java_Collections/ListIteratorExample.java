package IntermediateStage.java_Collections;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ramesh");
        names.add("Suresh");
        names.add("Mahesh");

        ListIterator<String> li = names.listIterator();

        System.out.println("Forward Direction:");
        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("\nBackward Direction:");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}

