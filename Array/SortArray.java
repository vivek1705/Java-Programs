package Array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        
        int[] number = {100, 500, 200, 700, 900, 1000, 300, 400, 600, 800};
        String[] str = {"Array", "java", "C++", "html", "CSS", "Function"};

        System.out.println("Original integer array is: " +Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Sorted integer array is: " +Arrays.toString(number));

        System.out.println("Original String array is: " +Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Sorted String array is: " +Arrays.toString(str));
    }
    
}
