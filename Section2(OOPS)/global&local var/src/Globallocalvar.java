class Globallocalvar
{
	static int v1=01;									//data Member is called as {GLOBAL VARIABLE}
	double z1=545.0;									//Global vaeiable is always declared inside the class...

	public  void test()									//{LOCAL VARIABLES} are declared only in declaration or 
	{													//defination of the method
		System.out.println("this is test method");	
		double z1=511.0;								//{local variables} con not have access modifiers
		System.out.println("v1 :"+v1);
		System.out.println("global v1 :"+Sample2.v1);
		System.out.println("z1 :"+z1);
		System.out.println("non static global z1 :"+this.z1);
	}
	public static void main(String[] args) {
		new Sample2().test();
		System.out.println("v1 :"+v1);
		System.out.println("non static global z1 :"+new Sample2().z1);

	}
}