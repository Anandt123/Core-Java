package com.Collection.list;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		list.add("java");
		list.add(100);
		list.add(20.0);
		list.add('H');
		list.addFirst("sql");
		list.addLast('C');
		list.add(2, "HTML");
		
		/*Object firstelement = list.getFirst();
		Object lastelement = list.getLast();
		Object element = list.get(3);
		
		System.out.println(firstelement);
		System.out.println(lastelement);
		System.out.println(element);
		
		System.out.println(list);
		
		Object removefirst = list.removeFirst();
		Object removelast = list.removeLast();
		Object removeelement = list.remove(3);
		
		System.out.println(removefirst);
		System.out.println(removelast);
		System.out.println(removeelement);
		
		System.out.println(list);*/
		
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}

}
