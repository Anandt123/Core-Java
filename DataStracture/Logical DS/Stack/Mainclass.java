package com.jspidersdatastractures.Stack;

public class Mainclass {

	public static void main(String[] args) 
	{
		Stack stack = new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.pop();
		stack.pop();
		System.out.println("----peak----");
		stack.peak();
	}

}
