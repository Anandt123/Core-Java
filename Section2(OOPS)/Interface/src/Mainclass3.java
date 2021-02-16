interface Run1
{
	public void display();
	public void test();
}

interface Run2 
{
	public void count();
	public void test();
}

class Sample extends Object implements Run1,Run2
{
	@Override
	public void count()
	{
		System.out.println("Overriding count() of Sample class");
	}

	@Override
	public void display()
	{
		System.out.println("Overriding display() of Sample class");
	}
	@Override
	public void test()
	{
		System.out.println("Overriding test() of Sample class");
	}
}
class Mainclass3
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");

		
		Sample s1 = new Sample();
		s1.count();
		s1.display();
		s1.test();
		System.out.println("program ends...");
	}
}