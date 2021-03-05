package com.jspiders.threads;

class threadtask1 implements Runnable
{
	String s1 = null;
	
	public threadtask1(String s1)
	{
		this.s1 = s1;
	}
	@Override
	public void run() 
	{
		System.out.println("t1 starts...");
		System.out.println("t1 waiting to lock s1");
		
		synchronized (s1) {
			System.out.println("t1 locked s1");
			s1 = s1.concat("world");
			System.out.println(s1);
			System.out.println("t1 unlocked s1");
		}
		System.out.println("t1 ends...");
	}
}

class threadtask2 implements Runnable
{
	String s2 = null;
	
	public threadtask2(String s2)
	{
		this.s2 = s2;
	}
	@Override
	public void run() 
	{
		System.out.println("t2 starts...");
		System.out.println("t2 waiting to lock s2");
		
		synchronized (s2) {
			System.out.println("t2 locked s2");
			s2 = s2.concat("java");
			System.out.println(s2);
			System.out.println("t2 unlocked s2");
		}
		System.out.println("t2 ends...");
	}
}
public class Synchronizedblock 
{
	public static void main(String[] args) 
	{
		String str = new String("hello");
		
		threadtask1 t1 = new threadtask1(str);
		threadtask2 t2 = new threadtask2(str);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
	}

}
