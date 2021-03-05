package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task01 implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Task Executed...");
	}
}
public class Fixedthreadpole 
{
	public static void main(String[] args) 
	{
		Task01 t1 = new Task01();
		int cores = Runtime.getRuntime().availableProcessors();
		
		System.out.println("cores : "+cores);
		ExecutorService ftp = Executors.newFixedThreadPool(cores);
		
		ftp.submit(t1);
		ftp.submit(t1);
		ftp.submit(t1);
		ftp.submit(t1);
		
		ftp.shutdown();  
				
	}

}
