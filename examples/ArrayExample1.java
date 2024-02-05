import java.util.Scanner;
class ArrayExample1
{
    public static void main(String[] args) {
        int n;
        System.out.println("enter number of elements :");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        int Arr[] = new int[n];       // create array

        System.out.println("Enter " +n+ " numbers");
        for(int i=0; i<n; i++)
        {
            Arr[i]= sc.nextInt();
        }

        System.out.println("entered numbers are : ");
        for(int i=0; i<=n; i++)
        {
            System.out.println(Arr[i]);
        }

        sc.close();
    }
}
