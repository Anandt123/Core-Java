class decendingwhile
{
	public static void test(int n)
	{
		int a=n;
		while (a>= 1)
		{
			System.out.println(a);
			--a;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("decending 1 to n while loop");
		test(5);
		System.out.println("program ends");
	}
}
