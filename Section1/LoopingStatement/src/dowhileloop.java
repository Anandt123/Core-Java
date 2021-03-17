class dowhileloop
{
	public static void test(int num)
	{
		int count =15;
		do
		{
			System.out.println("hello world");
			count++;
		}
		while (count<=num);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		test(7);
		System.out.println("program ends");
	}
}
