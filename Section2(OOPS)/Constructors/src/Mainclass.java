class Employee
{
	String name;
	int id;
	double sal;
	String dept;
	String job;

	public Employee(String name,int id,double sal,String dept,String job)
	{
	this.name=name;
	this.id= id;
	this.sal= sal;
	this.dept= dept;
	this.job= job;
	}

	public void showempdetails()
	{
		System.out.println("name : "+name);
		System.out.println("id : "+id);
		System.out.println("sal : "+sal);
		System.out.println("dept : "+dept);
		System.out.println("job : "+job);
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("yash",123,2500.0,"DEV","ASE");
		e1.showempdetails();

		Employee e2 = new Employee("anuskha",321,5200.0,"QA","TE");
		e2.showempdetails();
	}
}