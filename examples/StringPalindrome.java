import java.util.Scanner;
class StringPalindrome 
{
    public static void main(String[] args) {
        String original,reverse="";
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();
        int  length = original.length();
 
        for(int i=length-1;i>=0;i--)
        {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
