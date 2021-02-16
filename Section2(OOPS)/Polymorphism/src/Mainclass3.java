class Sample						//Golden rule in java is (Using parent class ref variable when we 
									//want to call method of parent class whenever the method is overridden
									//then the child classes overridden method is executed.....)
{									//(dueto runtime polymorphism)
	public void view()
	{
		System.out.println("this is the view() of Sample class");
	}
}
class Demo extends Sample
{
	public void Display()
	{
		System.out.println("this is the Display() of Demo class");
	}
	@Override
	public void view()
	{
		System.out.println("Overridden view() of Demo class");
	}
}
class Mainclass3
{
	public static void main(String[] args) 
	{
		Demo ref1 = new Demo();
		Sample ref2 = ref1;

		ref2.view();
	}
}