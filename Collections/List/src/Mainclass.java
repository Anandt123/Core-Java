package com.Collection.list;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);//insert
		list.add(10);
		list.add(20.5);
		list.add("Sql");
		list.add(null);
		list.add(null);
		
		Object obj = list.get(0);
		Integer i1 = (Integer) obj;
		System.out.println(i1);
		
		Object obj1 = list.get(2);
		Double d1 = (Double) obj1;
		System.out.println(d1); 
		
		Object obj2 = list.get(3);
		String s1 = (String) obj2;
		System.out.println(s1);
		
		//for (int i = 0; i < list.size(); i++) {
			//Object obj = list.get(i);
			//System.out.println(obj);
		//}
	}

}
