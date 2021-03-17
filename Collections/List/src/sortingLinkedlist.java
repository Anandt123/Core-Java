package com.Collection.list;

import java.util.Collections;
import java.util.LinkedList;

public class sortingLinkedlist {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.add("randimaga");
		list.add("sulimaga");
		list.add("bhosdimaga");
		list.add("chodimaga");
		list.add("hadsimaga");
		
		Collections.sort(list);
		System.out.println(list);
	}

}
