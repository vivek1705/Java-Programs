// getting user input 
import java.util.Scanner;
class GetUserInput 
{
    public static void main(String args[]) 
    {
        int i;
        String s;
        float f;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer: ");
        i = sc.nextInt();
        System.out.println("you entered " +i);

        /*System.out.println("enter String: ");
        s = sc.nextLine();
        System.out.println("you entered " +s);*/

       /*  System.out.println("enter float: ");
        f = sc.nextFloat();
        System.out.println("you entered " +f);*/
    }
}
