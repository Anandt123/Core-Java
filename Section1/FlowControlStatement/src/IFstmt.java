class IFstmt
{
	public static void test(int num)
	{
		System.out.println("num : "+num);
		if (num > 10) 
		{
			System.out.println(num+ "is greater then 10");
		}
		return;
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		
		test (50);
		test (5);
				
		System.out.println("program ends...");
	}
}
