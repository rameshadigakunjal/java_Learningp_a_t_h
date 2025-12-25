

public class ArrayExamples {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 123, 47};
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
