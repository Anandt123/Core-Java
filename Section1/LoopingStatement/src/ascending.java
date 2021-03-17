class ascending
{
	public static void test(int n)
	{
		int a=1;
		for (int count=1; count<= n; count=count+1)
		{
			System.out.println(a);
			++a;
		}
	}
	
	public static void test1(int n)
	{
		int b=1;
		while (b<= n)
		{
			System.out.println(b);
			++b;
		}
	}

	public static void test2(int n)
	{
		int c=1;
		do
		{
			System.out.println(c);
			++c;
		}
		while (c<= n);
	}

	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("ascending 1 to n for loop");
		test(5);
		System.out.println("ascending 1 to n while loop");
		test1(5);
		System.out.println("ascending 1 to n dowhile loop");
		test2(5);
		System.out.println("program ends");
	}
}
