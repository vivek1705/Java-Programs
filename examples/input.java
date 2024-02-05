// input from user

import java.util.Scanner;
public class input 
{
	public static void main(String[] args)
	{
		int num;
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int input= sc.nextInt();
		System.out.println("Entered number is:"+input);
	}
}


//  reading user input from readline 
/*public class input
{
	public static void main(String [] args)
	{
		int num;
		num = System.console().readline();
		System.out.println("Entered value is:" +num);
	}
}*/