

public class ArrayMethods {
    static void getArrayLength(int[] arr){
        for(int i=0;i<arr.length;i++){
            // Just iterating through the array
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        getArrayLength(myArray);
    }
}
