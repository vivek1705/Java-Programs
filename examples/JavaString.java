public class JavaString
{
    public static void main(String args[])
    {
        String s1="Welcome";                            // String Literals
        char ch[]={'w','e','l','c','o','m','e'};        // creating char array  
        String s2 = new String(ch);                     // converting char array to string
        String s3 = new String("Welcome");     // creating string using new keyword

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}