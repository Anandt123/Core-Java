class Sample								//this is the class from where all the properties 
{											//are inherited to demo class
	int v1=100;								//(Superclass,Baseclass,Parentclass)
	public void test1()
	{
		System.out.println("this is a test1() method of Sample class");
	}
}

class Demo extends Sample					//this class which is inheriting 
{											//properties of Sample class
	int v2=200;								//(Subclass,derivedclass,childclass)
	public void test2()
	{
		System.out.println("this is a test2() method of demo class");
	}
}

class Mainclass								//to eliminate duplicate methods
{											//we are using INHERITANCE.....
	public static void main(String[] args) 
	{
		Demo ref = new Demo();				//this is the object of child class
		
		System.out.println("v2 : "+ref.v2);	//here we are accessing the properties of childclass : v2
		ref.test2(); 						//and test2() of childclass using childclass...

		System.out.println("v1 : "+ref.v1);	//here we are accessing the properties of parentclass : v1
		ref.test1();						//and test1() of parentclass using childclass...
	}
}
