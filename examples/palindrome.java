import java.util.*;
class palindrome
{
    public static void main(String[] args) {
        String original, reverse="";
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        original = sc.nextLine();

        for(int i=0; i<original.length(); i++)
        {
            ch = original.charAt(i);
            reverse = ch+reverse;
        }
        System.out.println("Reverse string is  : " +reverse);

        if(reverse.equals(original))
        {
            System.out.println("Palindrome ");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}