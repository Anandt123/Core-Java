class Global
{
	static int v1=10;										//data Member is called as {GLOBAL VARIABLE}
	double z1=123.0;										//Global vaeiable is always declared inside the class...

	public void test1()										//{LOCAL VARIABLES} are declared only in declaration or 
	{														//defination of the method
		System.out.println("This is test1 (nonstatic)method");
		int v1=20;
		double z1=111.0;									//{local variables} con not have accessmodifiers
		System.out.println("local v1 :"+v1);				//(static & non static)con't used...
		System.out.println("local z1 :"+z1);
		System.out.println("static global v1 :"+Global.v1);
		System.out.println("non static global z1 :"+this.z1);//to avoide creating new object here we are using 
	}														//'this' comment the JVM itself creates and prints the result

	public static void test2()
	{
		System.out.println("This is test2 (static)method");
		int v2=30;
		double z2=222.0;
		System.out.println("local v2 :"+v2);
		System.out.println("local z2 :"+z2);
		System.out.println("static global v1 :"+v1);
		System.out.println("nonstatic global z1 :"+new Global().z1);//here wemust create a new object, Here we are accessing
	}																//non-static globalvariable inside a static method 

	public static void main(String[] args) 
	{
		System.out.println("Program starts........");
		new Global().test1();											//printing a method (test1) with non-static method
		System.out.println();
		test2();						   								//printing a method (test2) with static method
		System.out.println("Program ends.......");
	}
}