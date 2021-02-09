package Exceptionhandling;//trying to handle Exception in 
						//main method Thread.sleep
						//InterruptedException - if any thread has interrupted the current thread. 
						//The interrupted status of the current thread is cleared when this exception is thrown.
public class mainclass4 
{
	public static void test(int n1,int n2) throws InterruptedException
	{
		System.out.println("test starts....");
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		Thread.sleep(n1);
		
		System.out.println("test ends....");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts....");
		try
		{
			test(100,0);
		}
		catch(Exception ref)
		{
			System.out.println("Exception handled in main()");
			ref.printStackTrace();	//The first line of output contains the result of the 
									//toString() method for this object. Remaining lines represent 
									//data previously recorded by the method fillInStackTrace(). 
		}
		System.out.println("main ends....");
	}

}
