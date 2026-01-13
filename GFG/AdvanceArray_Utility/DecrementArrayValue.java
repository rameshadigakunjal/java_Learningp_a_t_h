package GFG.AdvanceArray_Utility;

public class DecrementArrayValue {

    public static int[] decrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int[] result = decrementArray(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
