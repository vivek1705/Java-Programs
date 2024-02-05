import java.util.Scanner; 
class swappingUsing3rdVariable 
{
    public static void main(String args[])
    {
        int x,y,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x and y: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("before swapping x= " +x+ " and y= " +y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping x= " +x+ " and y= "+y);
    }    
}
