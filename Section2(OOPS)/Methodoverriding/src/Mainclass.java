
class Sample
{
	public void count(int num)
	{
		System.out.println("this is count() of (parent)Sample class");

		for(int i=1; i<=num; i++)
		{
			System.out.println(i);
		}
	}
}
class Demo extends Sample
{
	@Override 				//override annatation
	public void count(int num)
	{
		System.out.println("this is count() of (Child)Demo class");

		for(int i=num; i>=1; i--)
		{
			System.out.println(i);
		}
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		s1.count(5);

		Demo d1 = new Demo();
		d1.count(5);
	}
}