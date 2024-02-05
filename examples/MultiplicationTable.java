class MultiplicationTable {
	int n;
	void set(int x)
	{
		n=x;
	}
	
	void table()
	{
		for(int i=1; i<=10; i++)
		{
			int result = n*i;
			System.out.println(result);
		}
	}
};
	
class multi
{		
	public static void main(String[] args) 
	{
		MultiplicationTable m = new MultiplicationTable();
				m.set(5);
				m.table();
	}
};
