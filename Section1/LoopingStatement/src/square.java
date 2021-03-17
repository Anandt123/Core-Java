class square
{
	public static void test (int num )
	{
		
		for(int count =1; count<=num; count++)
		{
			int a=count*count;
			System.out.println(a);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts");

		test(5);
		System.out.println("square upto 6");
		test(6);

		System.out.println("program ends");
	}
	
}