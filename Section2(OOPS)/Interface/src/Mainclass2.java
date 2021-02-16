interface Run1
{
	public void display();
}

interface Run2 extends Run1
{
	public void count();
}

class Sample  implements Run2
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
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");

		System.out.println(Run.v1);

		Sample s1 = new Sample();
		s1.count();
		s1.display();
		System.out.println("program ends...");
	}
}