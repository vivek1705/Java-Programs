import java.util.Scanner;
/*1class Swapping
{
    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("enter x and y:");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("before Swapping:"+x +y);
        temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping:"+x +y);
    }
}
*/
class Swapping
{
    public static void main(String[] args) {
        int x,y;
        System.out.println("enter x and y:");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("before Swapping:"+x +y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping:"+x +y);
    }
}
