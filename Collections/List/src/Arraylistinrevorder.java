package com.Collection.list;

import java.util.ArrayList;

public class Arraylistinrevorder 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		for (int i = 1; i <= 10; i++) {
			list.add(i);
			
		}
		for (int i = list.size()-1; i >= 0; i--) {
			/*Object obj = list.get(i);
			Integer i1 = (Integer)obj;
			System.out.println(i1);*/
			
			Object obj = list.get(i);
			Integer value = (Integer)obj;
			if (value%2==0) {
				list.remove(i);
			}
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			Object obj = list.get(i);
			Integer value = (Integer)obj;
			System.out.println(value);
		}
	}

}
