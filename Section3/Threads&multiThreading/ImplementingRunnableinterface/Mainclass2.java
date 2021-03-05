package com.jspiders.threads;

class Superclass
{
	public void test()
	{
		System.out.println("test method of Superclass");
	}
}

class Taskone extends Superclass implements Runnable
{
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Executing taskone");
		}
	}
}
class Tasktwo extends Superclass implements Runnable
{
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Executing tasktwo");
		}
	}
}
public class Mainclass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts..");
		Taskone t1 = new Taskone();
		Thread th1 = new Thread(t1);
		th1.start();
		t1.test();
		
		Tasktwo t2 = new Tasktwo();
		Thread th2 = new Thread(t2);
		th2.start();
		System.out.println("main ends...");
	}
}
