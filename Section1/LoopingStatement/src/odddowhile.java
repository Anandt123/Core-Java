class odddowhile
{
	public static void test(int n)
	{
		int a=1;
		do
		{
			if(a%2==1)
			System.out.println(a);
			++a;
		}
		while (a<= n);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("dowhile loop of odd numbers");
		test(10);
		System.out.println("program ends");
	}
}
