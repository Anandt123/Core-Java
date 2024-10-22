package com.jsp.libraries;

public class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = obj1;
		
		int h1 = obj1.hashCode();
		System.out.println(h1);
		
		int h2 = obj2.hashCode();
		System.out.println(h2);
		
		int h3 = obj3.hashCode();
		System.out.println(h3);
		
		String s1 = obj1.toString();
		System.out.println(s1);
		
		String s2 = obj2.toString();
		System.out.println(s2);
		
		boolean b1 = obj1.equals(obj2);
		System.out.println(b1);
		
		boolean b2 = obj1.equals(obj3);
		System.out.println(b2);
		
		System.out.println("program ends...");
	}
}
