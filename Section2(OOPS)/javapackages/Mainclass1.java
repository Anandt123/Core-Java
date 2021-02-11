package com.jspiders.pkg2;

import com.jspiders.pkg1.demo;

public class Mainclass1 extends demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mainclass1() starts....");
		
		demo d1 = new demo();
		System.out.println("v1 : "+d1.v1);
		d1.test1();
		
		Mainclass1 m1 = new Mainclass1();
		System.out.println("v2 : "+m1.v2);
		m1.test2();
		System.out.println("Mainclass1() ends....");
	}

}
