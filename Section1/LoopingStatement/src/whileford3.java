class whileford3
{
	public static void test(int n, int d)
	{
		int count =1;
		int res = n*d;
		
		while(count <= res)
		{
			System.out.println(count);
			count=count+d;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		test(8,6);
		System.out.println("program ends");
	}
}