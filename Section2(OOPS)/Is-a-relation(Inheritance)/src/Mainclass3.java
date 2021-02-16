class Mainclass3
{
	public static void main(String[] args) 
	{
		Child d1 = new Child();				//object of child class and performs
		System.out.println();				//multiple constructors...
		Child d2 = new Child(10);
		System.out.println();
		Child d3 = new Child(20,30);
		System.out.println();
		Child d4 = new Child("ak");
		System.out.println(d1.v1);
		d1.test1();
		System.out.println(d1.str);
		d1.test2();
	}
}

class Parent extends Object
{
	int v1 = 100;

	public Parent()
	{
		super();
		System.out.println("this is zero constructor() method of parent class");
	}
	public Parent(int a1)
	{
		super();
		System.out.println("this is parameterised constructor1() with one int");
	}
	public Parent(int a1,int a2)
	{
		super();
		System.out.println("this is parameterised constructor2() with 2 int's");
	}
	public Parent(String b1)
	{
		super();
		System.out.println("this is parameterised constructor3() with string");
	}
	public void test1()
	{
		System.out.println("this is the test1 method() of Parent class");
	}
}

class  Child extends Parent
{
	String str = "anand";

	public Child()
	{
		super();					//from this you can access zero cnstructor of parent class...
		System.out.println("this is zero constructor() method of Child class");
	}
	public Child(int a1)
	{								//from this you can access parametrised constructor
		super(a1);					//and you can pass only one argument
		System.out.println("this is parameterised constructor1() of Child class");
	}
	public Child(int a1,int a2)
	{								//from this you can access parametrised constructor
		super(a1,a2);				//and you can pass (0,1,2) any of the argument
		System.out.println("this is parameterised constructor2() of Child class");
	}
	public Child(String b1)
	{								//from this you can access parameterised constructor
		super(b1);					//string values can be accessed...
		System.out.println("this is parameterised constructor3() of Child class");
	}

	public void test2()
	{
		System.out.println("this is the test2 method() of Child class");
	}
}