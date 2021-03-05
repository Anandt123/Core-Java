package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskOne1 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("task executed...");
	}
}
public class Catchedthread 
{
	public static void main(String[] args) 
	{
		TaskOne1 t1 = new TaskOne1();
		
		ExecutorService ctp = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			ctp.submit(t1);
		}
		
	}

}
