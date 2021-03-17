class logicalXOR
{
	public static void main(String[] args) 
	{
		System.out.println("program starts..");

		int a1 = 100;
		int b1 = 20;
		int c1 = 15;

		System.out.println(a1 > b1 ^ a1 > c1);
		System.out.println(a1 > b1 ^ a1 < c1);
		System.out.println(a1 < b1 ^ a1 > c1);
		System.out.println(a1 < b1 ^ a1 < c1);

		System.out.println("program ends..");
 
	}
}