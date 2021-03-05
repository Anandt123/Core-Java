package com.jspiders.threads;

class task1 extends Thread//this is by extending thread class
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 3 ; i++) {
			System.out.println("executing taskone : ");
		}
	}
}
class task2 extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 3; i++) {
			System.out.println("executing tasktwo : ");
		}
	}
}
public class Mainclass1 
{
	
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		task1 t1 = new task1();
		t1.start();
		
		task2 t2 = new task2();
		t2.start();
		System.out.println("main ends");
	}

}
