package com.Collection.Set;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("java");
		set.add("springs");
		set.add("html");
		set.add("css");
		//set.add(null);
		//set.add(null);
		
		System.out.println(set);
		set.remove("css");
		System.out.println(set);
		
	}

}
