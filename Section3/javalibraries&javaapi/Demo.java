package com.jsp.libraries;

class Sam extends Object
{
	@Override
	public int hashCode() {
		return 10;
	}
	
	@Override
	public String toString() {
		return "tostring() is overridden";
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
		Sam s1 = new Sam();
		int a1 = s1.hashCode();
		System.out.println(a1);
		
		String a2 = s1.toString();
		System.out.println(a2);
	}

}
