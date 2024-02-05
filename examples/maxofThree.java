
public class maxofThree 
{
	static int maxofThree(int a, int b, int c)
	{
		if(a>=b && a>=c)
			return a;
		
		else if(b>=a && b>=c)
			return b;
		
		else
			return c;
	}
	
	public static void main(String [] args)
	{
		int a,b,c,largest;
		largest = maxofThree(10,55,2);
		System.out.println(largest + " is large number");
	}
}
