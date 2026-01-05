package AdvanceStage.Annotations;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings {
    public static void main(String[] args) {
        // No suppression needed when using generics correctly
        List<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println("List contents: " + list);
    }
}
