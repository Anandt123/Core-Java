package com.Collection.Set;

import java.util.LinkedHashSet;

public class Linkedhashset 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Java");
		set.add("springs");
		set.add("Html");
		set.add("css");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		set.remove(null);
		System.out.println(set);
		
	}

}
