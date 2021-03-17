class whileloop
{
	public static void test(int num)
	{
		int count =1;
		while (count<=num)
		{
			System.out.println("hello world");
			count++;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		test(7);
		System.out.println("program ends");
	}
}
