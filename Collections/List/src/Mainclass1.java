package com.Collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class Mainclass1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(101, "manja", 95.0);
		Student s2 = new Student(202, "gunda", 90.1);
		Student s3 = new Student(303, "ramesh", 70.6);
		Student s4 = new Student(404, "suresh", 90.6);
		
		ArrayList list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}
}
//Ascending order based on marks....