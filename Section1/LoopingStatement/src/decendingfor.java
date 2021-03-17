class decendingfor
{
	public static void test(int n)
	{
		int a=n;
		for (int count=n; count>= 1; count=count-1)
		{
			System.out.println(a);
			--a;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("decending 1 to n for loop");
		test(5);
		System.out.println("program ends");
	}
}
