interface Run1
{
	public static void display()
	{
		System.out.println("display () with Run1 static keyword");
	}
	public default void test()
	{
		System.out.println("this is test() of Run1 interface");
	}
}

interface Run2 
{
	public static void display()
	{
		System.out.println("display () with Run2 static keyword");
	}
	public default void test()
	{
		System.out.println("this is test() of Run2 interface");
	}
}

class Sample implements Run1,Run2	//implementing both the interfaces....
{
	@Override
	public void test()
	{
		Run1.super.test();
		Run2.super.test();
	}
}
class Mainclass5
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		
		Run1.display();
		Run2.display();
		Sample s1 = new Sample();
		s1.test();
		
		System.out.println("program ends...");
	}
}