package com.Collection.list;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector vector = new Vector();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
		for (int i = 0; i < vector.size(); i++) {
			Object obj = vector.get(i);
			Integer i1 = (Integer)obj;
			System.out.println(i1);
		}
	}

}
