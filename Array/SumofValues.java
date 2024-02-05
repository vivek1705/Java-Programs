package Array;

public class SumofValues {
    public static void main(String[] args) {
        
        int[] sum_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i < sum_array.length; i++) 
        {
            sum = sum + sum_array[i];
        }

        System.out.println("Sum of values of array is: " + sum);
    }
}
