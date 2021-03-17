class forloop
{
	public static void test(int num)
	{
		for (int count=1; count<= num; count=count+1)
		{
			System.out.println("hello world");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		test(10);
		System.out.println("program ends");
	}
}
