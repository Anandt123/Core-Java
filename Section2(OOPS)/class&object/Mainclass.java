class Demo
{
	static int v1=123;

	public static void test()
	{
		System.out.println("this is test() of demo class");
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		Demo.test();
		System.out.println(Demo.v1);
		System.out.println("program ends....");
	}
}