
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=123,reverse=0,rem;
		while(num !=0)
		{
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num/10;
		}
		System.out.println(reverse);
	}

}
