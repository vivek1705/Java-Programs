public class Immutable
{
    public static void main(String args[])
    {
        String s = "vivek";

        // s.concat("patil"); 
        // System.out.println(s);  //print vivek because strings are immutable objects

        /* to concat two string we want to explicitly assign concat method to the reference variable i.e s=s.concat() */
        
        s = s.concat(" Patil");
        System.out.println(s);
    }

}