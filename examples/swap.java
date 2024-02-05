
public class swap 
{
	static void swapping(int a, int b)
	{
		//with using third variable
		/*int temp = a;
		//a = b;
		//b = temp;
		System.out.println("after swapping: a=" +a+ " b=" +b);*/
		
		// without using third variable
		a = a-b;
		b = a+b;
		a = b-a;
		System.out.println("after swapping: a=" +a+ " b=" +b);

	}
	
	public static void main(String [] args)
	{
		int a,b;
		swapping(100,200);
	}
}