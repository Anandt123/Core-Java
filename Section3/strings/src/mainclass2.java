package strings;

public class mainclass2 
{
	public static String test(String str)
	{
		String res = "";
		int mid = (str.length()-1)/2;
		int lb = 0;
		
		for(int i=lb; i<=mid; i++)
		{
			char c1 = str.charAt(i);
			res = res + c1;
			
		}
		System.out.println("res : "+res);
		return res;
		
	}
	public static void main(String[] args) 
	{	
		System.out.println("program starts...");
		test("helloo");
		System.out.println("program ends...");
	}
}
