
class Employee
{
	String name;
	double sal;
	String dept;
	String job;

	public Employee(String name,double sal,String dept,String job)
	{
	this.name=name;
	this.sal= sal;
	this.dept= dept;
	this.job= job;
	}
	public Employee(String name,double sal,String dept)
	{
	this.name=name;
	this.sal= sal;
	this.dept= dept;
	}
	public Employee(String name,double sal)
	{
	this.name=name;
	this.sal= sal;
	}
	public Employee(String name)
	{
	this.name=name;
	}

	public void showempdetails()
	{
		System.out.println("name : "+name);
		System.out.println("sal : "+sal);
		System.out.println("dept : "+dept);
		System.out.println("job : "+job);
	}
}
class COverloding					//constructor with same name can be performed with
{									//(constructor overloading)....
	public static void main(String[] args) 
	{
		Employee e4 = new Employee("Kartik");
		e4.showempdetails();

		Employee e1 = new Employee("Anand",2500.0,"DEV","ASE");
		e1.showempdetails();
		System.out.println();
		Employee e2 = new Employee("Pavan",5200.0,"QA");
		e2.showempdetails();
		System.out.println();
		Employee e3 = new Employee("Vishnu",5000.0);
		e3.showempdetails();
		System.out.println();
			}
}
