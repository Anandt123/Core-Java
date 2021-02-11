package com.jspiders.pkg3;

import com.jspiders.pkg1.sample;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample.test();
		sample s1 = new sample();
		s1.display();
		System.out.println();
		
		com.jspiders.pkg2.sample.test();
		com.jspiders.pkg2.sample s2 = new com.jspiders.pkg2.sample();
		s2.display();
	}
}
