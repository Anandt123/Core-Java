class multipleof5
{
	public static void test(int n)
	{
		int a=1;
		for (int count=1; count<= n; count=count+1)	
		{
			if(a%5==0)
			System.out.println(a);
			++a;
		}
	}

	public static void test1(int n)
	{
		int b=1;
		while (b<= n)
		{
			if(b%5==0)
			System.out.println(b);
			++b;
		}
	}

	public static void test2(int n)
	{
		int c=1;
		do
		{
			if(c%5==0)
			System.out.println(c);
			++c;
		}
		while (c<= n);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("for loop of multipleof5 numbers");
		test(50);
		System.out.println("while loop of multipleof5 numbers");
		test1(50);
		System.out.println("dowhile loop of multipleof5 numbers");
		test2(50);
		System.out.println("program ends");
	}
}
