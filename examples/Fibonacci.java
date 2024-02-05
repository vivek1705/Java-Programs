import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args) {
        
        int a=0, b=0, c=1;
        int num;
        System.out.println("Enter number :");
        Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            
            System.out.println("Fibonacci series is:");
        for(int i=0;i<=num;i++)
        {
            a=b;
            b=c;
            c=a+b;

            System.out.println(a+ " ");
        }
    }
}