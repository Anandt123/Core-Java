package com.jspiders.threads;

class td1 implements Runnable
{
	String s1 = null;
	String s2 = null;
	
	public td1(String s1,String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() 
	{
		System.out.println("t1 starts....");
		System.out.println("t1 waiting to lock s1");
		synchronized (s1) {
			System.out.println("t1 locked s1");
			System.out.println("t1 waiting to lock s2");
			try {
				System.out.println("t1 pause the execution");
				s1.wait();
				System.out.println("t1 resume the execution");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (s2) {
				System.out.println("t1 locked s2");
			}
			System.out.println("t1 unlocked s2");
			
			System.out.println("t1 unlocked s1");
		}
		System.out.println("t1 ends....");
	}
}
class td2 implements Runnable
{
	String s1 = null;
	String s2 = null;
	
	public td2(String s1,String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() 
	{
		System.out.println("t2 starts....");
		System.out.println("t2 waiting to lock s2");
		synchronized (s2) {
			System.out.println("t2 locked s2");
			System.out.println("t2 waiting to lock s1");
	
			synchronized (s1) {
				System.out.println("t2 locked s1");
				s1.notify();
			}
			System.out.println("t2 unlocked s1");
			
			System.out.println("t2 unlocked s2");
		}
		System.out.println("t2 ends....");
	}
}
public class Threaddeadlock 
{
	public static void main(String[] args)
	{
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		td1 t1 = new td1(str1, str2);
		td2 t2 = new td2(str1, str2);
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
	}
}
