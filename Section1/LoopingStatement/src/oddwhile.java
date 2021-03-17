class oddwhile
{
	public static void test(int n)
	{
		int a=1;
		while (a<= n)
		{
			if(a%2==1)
			System.out.println(a);
			++a;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("while loop of odd numbers");
		test(10);
		System.out.println("program ends");
	}
}
