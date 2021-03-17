package com.Collection.list;

import java.util.LinkedList;

public class Linkedlist1stlastmiddle 
{
	public static void main(String[] args) {
	LinkedList list  = new LinkedList();
	
	list.add("java");
	list.add(100);
	list.add(20.0);
	list.add('H');
	list.addFirst("sql");//
	list.addLast('C');
	list.add(2, "HTML");
	
	Object obj = list.getFirst();
	System.out.println(obj);
	Object obj1 =list.getLast();
	System.out.println(obj1);
	Object obj2=(list.size()/2);
	System.out.println(obj2);
	Object obj3 = list.get(list.size()/2);
	System.out.println(obj3);
	}
	
}
