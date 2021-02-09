package Exceptionhandling;//here we are trying to handle the
						//ArithmeticException....

public class mainclass1 
{
	public static void test(int n1,int n2)
	{
		System.out.println("test starts....");
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		try
		{
			double res = n1/n2;
			System.out.println("res : "+res);
		}
		catch(ArithmeticException ref)
		{
			System.out.println("handled ArithmeticException");
			System.out.println("INVALID NUMBER FOR DIVISION");
		}
		
		System.out.println("test starts....");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		test(100,0);
		System.out.println("main ends....");
	}
}
