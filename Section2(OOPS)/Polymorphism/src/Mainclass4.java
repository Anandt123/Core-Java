abstract class Sample
{
	abstract public void view();
}
class Demo extends Sample
{
	public void Display()
	{
		System.out.println("this is the Display() of Demo class");
	}
	public void view()
	{
		System.out.println("Overridden view() of Demo class");
	}
}
class Mainclass4
{
	public static void main(String[] args) 
	{
		Demo ref1 = new Demo();
		Sample ref2 = ref1;

		ref2.view();
	}
}