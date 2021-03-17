class differenced3
{
	public static void test(int n, int d)
	{	
		int res=n*d;
		for (int count=1; count<=res; count=count+d) 
		{
			System.out.println(count);
		}
	}
	public static void main(String[] args) 
	{
		test (6,3);
		System.out.println("n=8 and d=6");
		test (8,6);

	}
}