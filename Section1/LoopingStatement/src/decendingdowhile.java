class decendingdowhile
{
	public static void test(int n)
	{
		int a=n;
		do
		{
			System.out.println(a);
			--a;
		}
		while (a>= 1);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		System.out.println("decending 1 to n dowhile loop");
		test(5);
		System.out.println("program ends");
	}
}
