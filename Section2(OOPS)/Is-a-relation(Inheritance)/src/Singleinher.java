class Singleinher							//here we are inheriting the properties from 
{											//one parent class to only one child class
	public static void main(String[] args) 
	{
		Child ref = new Child();
		System.out.println("v1 : "+ref.v1);
		ref.test1();
		System.out.println("v2 : "+ref.v2);
		ref.test2();
	}
}

class Parent 							//this is parent class
{
	int v1 = 10;
	public void test1()
	{
		System.out.println("this is a test1() method of parent class");
	}
}

class Child extends Parent 				//inheriting parent class from child class...
{
	int v2 = 20;
	public void test2()
	{
		System.out.println("this is a test2() method of child class");
	}
}