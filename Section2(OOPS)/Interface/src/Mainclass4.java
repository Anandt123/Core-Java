interface Run 			//super interface
{
	public void display();	

	public static void view()		//static method
	{
		System.out.println("view() with the static keyword");
	}

	public default void test()		//default : non static concrete method
	{
		System.out.println("test() with the default keyword");
	}
}

class Sample implements Run
{
	@Override
	public void display()
	{
		System.out.println("Overriding display() of sample class");
	}
}
class Mainclass4
{
	public static void main(String[] args) 
	{
		System.out.println("program starts.....");
		Run.view();

		Sample s1 = new Sample();
		s1.display();
		s1.test();
		System.out.println("program ends....");
	}
}