package com.jspiders.empdb;

import java.sql.SQLException;

public class mainclass {

	public static void main(String[] args) 
	{
		mysqlimpl m1 = new mysqlimpl();
		m1.intitDb();
		
		/*Employee emp1 = new Employee(7369, "SMITH", "CLERK", "17-DEC-80", 800, 0, 20);
		Employee emp2 = new Employee(7499, "ALLEN", "SALESMAN", "20-FEB-81", 1600, 300, 30);
		Employee emp3 = new Employee(7521, "WARD", "SALESMAN", "22-FEB-81", 1250, 500, 30);
		Employee emp4 = new Employee(7566, "JONES", "MANAGER", "02-APR-81", 2975, 0, 20);
		Employee emp5 = new Employee(7654, "MARTIN", "SALESMAN", "28-SEP-81", 1250, 1400, 30);
		Employee emp6 = new Employee(7698, "BLAKE", "MANAGER", "01-MAY-81", 2850, 0, 30);
		Employee emp7 = new Employee(7782, "CLARK", "MANAGER", "09-JUN-81", 2450, 0, 10);
		Employee emp8 = new Employee(7788, "SCOTT", "ANALYST", "09-DEC-82", 3000, 0, 20);
		Employee emp9 = new Employee(7839, "KING", "PRESIDENT", "17-NOV-81", 5000, 0, 10);
		Employee emp10 = new Employee(7844, "TURNER", "SALESMAN", "08-SEP-81", 1500, 0, 30);
		Employee emp11 = new Employee(7876, "ADAMS", "CLERK", "12-JAN-83", 1100, 0, 20);
		Employee emp12 = new Employee(7900, "JAMES", "CLERK", "03-DEC-81", 950, 0, 30);
		Employee emp13 = new Employee(7902, "FORD", "ANALYST", "03-DEC-81", 3000, 0, 20);
		Employee emp14 = new Employee(7934, "MILLER", "CLERK", "23-JAN-82", 1300, 0, 10);
		*/
		try 
		{
			/*
			m1.addEmployee(emp1);
			m1.addEmployee(emp2);
			m1.addEmployee(emp3);
			m1.addEmployee(emp4);
			m1.addEmployee(emp5);
			m1.addEmployee(emp6);
			m1.addEmployee(emp7);
			m1.addEmployee(emp8);
			m1.addEmployee(emp9);
			m1.addEmployee(emp10);
			m1.addEmployee(emp11);
			m1.addEmployee(emp12);
			m1.addEmployee(emp13);
			m1.addEmployee(emp14);*/
			
			Employee emp = m1.getEmployee(7934);
			System.out.println(emp.ename); 
			System.out.println(emp.job);
			System.out.println(emp.sal);
			System.out.println(emp.hiredate);
			System.out.println(emp.comm);
			System.out.println(emp.deptno);

			//m1.updateEmployeename(7934, "ANAND");
			//m1.deleteEmployee(7902);
		}
		catch (SQLException e) 
		{	
			e.printStackTrace();
		}
		m1.closeConnection();
	}

}
