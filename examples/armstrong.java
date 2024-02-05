import java.util.Scanner;
class armstrong
{
    public static void main(String[] args) {
        
        int n,temp,reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        n = sc.nextInt();
        
        temp = n;
        while(n != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }
        //System.out.println("reverse number is : " +reverse);

        if(reverse == temp)
        {
            System.out.println("amstrong number");
        }
        else{
            System.out.println("not amstrong number");
        }
    }
}