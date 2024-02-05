
public class prime 
{
	int n;
	void set(int x)
	{
		n=x;
	}
	void decide()
			{
				int i;
				for(i=2; i<n; i++)
				{
					if(n%i==0)
					{
						break;
					}
				}
			
			if(i==n)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
			}
};

class demo
{
	public static void main(String args[])
	{
		prime p = new prime();
		p.set(11);
		p.decide();
	}
};
