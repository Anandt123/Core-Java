package Exceptionhandling;//try to avoide the exception using the 
						//if-else statement...
public class mainclass 
{

	public static void test(int n1,int n2)
	{
		System.out.println("test() starts...");
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		
		if(n2>0)
		{
			double res = n1/n2;
			System.out.println("res : "+res);
		}
		else
		{
			System.out.println("INVALID NUMBER FOR DIVISSION");
		}
		System.out.println("test() starts...");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program starts.....");
		
		test(100,0);
		
		System.out.println("Program ends.....");
	}

}
