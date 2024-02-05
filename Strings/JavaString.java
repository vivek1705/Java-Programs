package Strings;

public class JavaString {
    public static void main(String[] args) {
        // create a string
        String str = "Hello";
        System.out.println(str);

        //length of string
        String txt = "QWERTYUIOPASDFGHJKLZXCVBNM";
        System.out.println("String length is : " +txt.length());

        //methods to convert string uppercase and lowercase
        String text = "Hello java";
        System.out.println("String in Uppercase : " +text.toUpperCase());
        System.out.println("String in Lowercase : " +text.toLowerCase());

        //finding string in string i.e finding location
        String loc = "this is string";
        System.out.println(loc.indexOf("string"));
        
        // string concatation
        String fname = "ABC", lname = "xyz";
        System.out.println(fname + " " +lname);
        
        String a = "10";
        int b = 20;
        String c = a+b;
        System.out.println(c);
    }
}
