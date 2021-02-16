interface View 					//super interface
{
	static final int v1=10;
	abstract public void count();
}

class Sample implements View 	//implimentation class
{
	@Override
	public void count()
	{
		System.out.println("Overriding count() of Sample classa");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");

		System.out.println(View.v1);
		

		Sample s1 = new Sample();
		s1.count();
		System.out.println("program ends...");
	}
}