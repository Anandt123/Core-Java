package com.jsp.libraries;

//java bean
class Employee extends Object
{
	private int id;
	private String name;
	private double sal;
	private String job;
	
	public Employee(int id,String name, double sal, String job) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.job = job;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public int hashCode() 
	{
		return id;
	}
	
	@Override
	public String toString() 
	{
		return id +" "+name+" "+sal+" "+job;
	}
	
	@Override
	public boolean equals(Object obj) // upcasting is happening Object obj= e2/e3;`
	{
		if(id==obj.hashCode())
		{
			return true;
		}
		return false;
	}
}
public class mainclass1 {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"Anand",2000.00,"dev");
		Employee e2 = new Employee(2,"Pavan",4000.00,"Qa");
		Employee e3 = new Employee(1,"Anand",2000.00,"dev");
		
		System.out.println(e1.hashCode());
		System.out.println(e1.toString());
		
		System.out.println(e2.hashCode());
		System.out.println(e2.toString());
		
		System.out.println(e3.hashCode());
		System.out.println(e3.toString());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}

}
