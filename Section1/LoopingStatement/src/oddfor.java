class oddfor
{
	public static void test(int n)
	{
		int a=1;
		for (int count=1; count<= n; count=count+1)	
		{
			if(a%2==1)
			System.out.println(a);
			++a;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("for loop of Odd numbers");
		test(10);
		System.out.println("program ends");
	}
}
