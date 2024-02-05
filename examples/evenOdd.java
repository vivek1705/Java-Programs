import java.util.Scanner;
public class evenOdd 
{
	public static void main(String [] args)
	{
		int num;
		System.out.println("Enter number:" );
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println(+num+ " is EVEN");
		}
		else
		{
			System.out.println(+num+ " is ODD");
		}
			
		sc.close();
	}

}
