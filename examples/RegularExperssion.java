/*Create a regular expression that accepts alphanumeric characters only.  
Its length must be six characters long only.*/  

import java.util.regex.*;
public class RegularExperssion
{
   /*  public static void main(String args[])
    {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "vivek1"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "ABCDE"));
    }
    */


/*Create a regular expression that accepts 10 digit numeric characters 
 starting with 7, 8 or 9 only.*/

    public static void main(String args[])
    {
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "1234567890"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9123456783"));
    }
}