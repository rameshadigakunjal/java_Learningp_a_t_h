

import java.util.Arrays;

public class SmallestElementStream {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};

        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println("Smallest element: " + min);
    }
}
