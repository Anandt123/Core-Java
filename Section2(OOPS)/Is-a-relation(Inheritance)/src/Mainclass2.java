class Mainclass2							//while accessing the variables of parentclass 
{											//with the help of child class..
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();				//object of child class inheriting properties of
		System.out.println(d1.z1);			//parent class Also....
		d1.display();
		System.out.println();
		d1.view();
	}
}

class Sample extends Object 				//class sample is parent class which inheriting
{											//properties of Object class,every class directly 
	int z1=23;								//or indirectly inherit the properties of Object class

	public Sample(String str)
	{
		System.out.println(str);
		System.out.println("parent class - Sample() constructor executed");
	}

	public void display()
	{
		System.out.println("this is display() of Sample class");
	}
}

class Demo extends Sample 				//demo class inheriting the properties of 
{										//sample class 

	public Demo()
	{
		super("dinga");
		System.out.println("parent class - Demo() constructor executed");
	}

	public void view()
	{
		System.out.println("this is view() of Sample class");
	}
}