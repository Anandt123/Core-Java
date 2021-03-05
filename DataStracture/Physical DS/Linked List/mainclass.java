package com.jspidersdatastractures.linkedlist;

public class mainclass {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList(10);
		//list.insert(60, 6);
		list.insert(20, 1);
		list.insert(40, 3);
		list.insert(30, 2);
		list.insert(70,5);
		list.insert(85, 8);
		list.insert(60, 4);
		list.insert(75, 6);
		list.insert(100, 10);
		list.insert(90, 7);
		list.insert(110, 15);
		list.insert(120, 25);
		list.insert(130, 17);
		
		list.search(40);
		//list.delete(0);
		list.traverseLinkedList();
	
	}

}
