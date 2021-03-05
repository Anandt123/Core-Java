package com.jspiders.threads;

class Counter
{
	private int v1 = 0;
	
	synchronized public void increment()
	{
		v1++;
	}
	synchronized public void decrement()
	{
		v1--;
	}
	synchronized public void Showvalue()
	{
		System.out.println("v1 : "+v1);
	}
}

class threadtaskone implements Runnable
{
	Counter c1 = null;
	public threadtaskone(Counter c1)
	{
		this.c1 = c1;
	}
	@Override
	public void run() 
	{
		c1.increment();
		c1.Showvalue();
	}
}

class threadtasktwo implements Runnable
{
	Counter c2 = null;
	public threadtasktwo(Counter c2)
	{
		this.c2 = c2;
	}
	@Override
	public void run() 
	{
		c2.decrement();
		c2.Showvalue();
	}
}

public class Synchronizedmethod 
{
	public static void main(String[] args) 
	{
		Counter ctr = new Counter();
		
		threadtaskone t1 = new threadtaskone(ctr);
		threadtasktwo t2 = new threadtasktwo(ctr);
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
	}

}
