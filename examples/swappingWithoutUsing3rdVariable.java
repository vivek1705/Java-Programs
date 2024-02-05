import java.util.Scanner;
class swappingWithoutUsing3rdVariable
{
    public static void main(String[] args) 
    {
        int x,y;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x and y: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("before swapping x= " +x+ " and y= " +y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping x= " +x+ " and y= "+y);
    }
}