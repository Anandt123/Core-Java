class Demo
{
	int v1 =1356;

	public void test()
	{
		System.out.println("this is test() of Demo class");
	}
}

class Mainclass1
{
	public static void main(String[] args) 
	{
		System.out.println("program starts....");
		new Demo().test();
		System.out.println(new Demo().v1);
		System.out.println("program ends....");
	}
}