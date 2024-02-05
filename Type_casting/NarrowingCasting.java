package Type_casting;

public class NarrowingCasting {
    
    /* Narrowing casting(manually casting): converting larger type to a smaller type size.
     *doule- float- long- int- char- short- byte
     */

     public static void main(String[] args) {
        
        double value = 10.01d;
        int typecast = (int) value;

        System.out.println(value);
        System.out.println(typecast);
     }
}
