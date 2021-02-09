package Exceptionhandling;//generalized try catch block...
						//ref.printStackTrace(); used to track the 
						//exception error..
public class mainclass3 
{
	public static void test(int n1,int n2)
	{
		System.out.println("test starts....");
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		int[] a1 = {10,20,30,40};
		
		try
		{
			int res = (n1/n2);
			System.out.println("res : "+res);
			System.out.println("element at "+res+" is : "+a1[res]);
		}
		catch(Exception ref)
		{
			System.out.println("handled Exception");
			ref.printStackTrace();
		}
		finally
		{
			System.out.println("Finally block Executed..");
		}
		System.out.println("test ends....");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		test(100,0);
		test(100,22);
		System.out.println("main ends....");
	}

}
