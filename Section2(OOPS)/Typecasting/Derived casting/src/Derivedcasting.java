class Demo
{
	int v1 = 100;
	public void view()
	{
		System.out.println("this is view() of parent class");
	}
}
class Sample extends Demo
{
	Double z1 = 50.0;
	public void display()
	{
		System.out.println("this is Display() of child class");
	}
}
class Derivedcasting
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		Sample ref1 = new Sample();

		Demo ref2 = ref1;								//up casting
		System.out.println(ref2.v1);
		ref2.view();

		Sample ref3 = (Sample)ref2;						//down casting
		System.out.println(ref3.v1);
		ref3.view();
		System.out.println(ref3.z1);
		ref3.display();
		System.out.println("program ends....");
	}
}