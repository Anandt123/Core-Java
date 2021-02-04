abstract class Sample		//parent class,super class,base class
{
	static int v1=1000;
	double d=3.142;						//method which has only declaration of the method
	abstract public  void test();		//do not contain defination of method called 
										//abstract method and any method contain a abstract 
										//method then it is called abstract class...
	public static void display1()
	{
		System.out.println("this is the static display1() method of parent class");
	}
	public void display2()
	{
		System.out.println(d);
		System.out.println("this is the non-static display2() method of parent class");
	}
}
class Demo extends Sample		//child class,sub class,derived class
{
	double d= 3.14;
	@Override
	public void test()
	{
		System.out.println("this is the test() of sub class");
		System.out.println(super.d);
	}
	public void view()
	{
		System.out.println("this is the view() method of child class");
	}
}
class Mainclass
{
	public static void main(String[] args) {
	
	
	Sample.display1();				//we can call static members of the Abstract class 
	System.out.println(Sample.v1);	//but it is Impossible to call non-static members.
	System.out.println();			//so we must inherit the properties to child class from
									//parent class then we can access both static and non-static
									//members of Abstract class.....
	Demo d1 = new Demo();
	System.out.println(d1.v1);
	System.out.println(d1.d);
	d1.test();
	d1.display1();
	d1.display2();
	d1.view();
	}
}
