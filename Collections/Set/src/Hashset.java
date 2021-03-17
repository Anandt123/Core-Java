package com.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{
	public static void main(String[] args) 
	{
		System.out.println("----String Hashset------");
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("Spring");
		set.add("Sql");
		set.add("html");
		set.add("css");
		set.add("javaScript");
		
		System.out.println(set);
		
		System.out.println(" ");
		System.out.println("---Integer Hashset-------");
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(null);
		set1.add(null);
		
		System.out.println(set1);
		set1.remove(null);
		
		Iterator<Integer> ref = set1.iterator();
		
		while(ref.hasNext()) {
			Integer value = ref.next();
			System.out.println(value);
			}
		System.out.println(set1);
	}

}
