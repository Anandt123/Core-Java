class decending
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

	public static void test1(int n)
	{
		int b=n;
		while (b>= 1)
		{
			System.out.println(b);
			--b;
		}
	}

	public static void test2(int n)
	{
		int c=n;
		do
		{
			System.out.println(c);
			--c;
		}
		while (c>= 1);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("decending 1 to n for loop");
		test(5);
		System.out.println("decending 1 to n while loop");
		test1(5);
		System.out.println("decending 1 to n dowhile loop");
		test2(5);
		System.out.println("program ends");
	}
}
