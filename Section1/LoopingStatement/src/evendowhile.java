class evendowhile
{
	public static void test(int n)
	{
		int a=1;
		do
		{
			if(a%2==0)
			{
				System.out.println(a);
			}
			++a;
		}
		while (a<= n);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("dowhile loop of Even numbers");
		test(10);
		System.out.println("program ends");
	}
}
