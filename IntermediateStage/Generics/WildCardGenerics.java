package IntermediateStage.Generics;
//6. Write a program to demonstrate the use of WildCard Generics.
//6.1 ? (Unbounded Wildcard)
//6.2 ? extends T (Upper Bounded Wildcard)
//6.3 ? super T (Lower Bounded Wildcard)

import java.util.List;

public class WildCardGenerics {
    public static void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
        
    }
}
    public static void printNumbers(List<? extends Number> list) {
    for (Number num : list) {
        System.out.println(num);
    }
}

    public static void addIntegers(List<? super Integer> list) {
    list.add(100);
    list.add(200);

    System.out.println("List after adding integers: " + list);
    }
}

