package IntermediateStage.Generics;
    //5. Write a program to demonstrate the use of Generics with Method.

public class GenereicsMethodExample {
    
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Generics"};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(stringArray);
    }
}
