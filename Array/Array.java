package Array;

public class Array {
    public static void main(String[] args) {
        
        String[] str = {"one", "two", "three"};
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        //accessing array length 
        System.out.println("String Array is: " +str.length);
        System.out.println("Integer Arrray is: " +num.length);

        //accessing array elements using index
        System.out.println("String at index two is: " +str[2]);
        System.out.println("number at index 9 is: " +num[9]);

        //change array element
        str[2] = "four";
        System.out.println("Strings are:");
        for(int i=0; i<str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
}
