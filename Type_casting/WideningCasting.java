package Type_casting;

public class WideningCasting {
    /* widening casting (automatically casting) : converting smaller type to a larger type size.  
       byte -> short -> char -> int -> long -> float -> double 
     */

     public static void main(String[] args) {
        int cast = 100;
        double typecast = cast;

        System.out.println(cast);
        System.out.println(typecast);
     }
}
