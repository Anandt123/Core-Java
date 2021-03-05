package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Singlethreads implements Runnable 
{
	@Override
	public void run() {
		System.out.println("Singlethread Executing task...");
	}
}
public class singleThread 
{
	public static void main(String[] args) 
	{
		Singlethreads st = new Singlethreads();
		ExecutorService stp = Executors.newSingleThreadExecutor();
		for (int i = 0; i <=5; i++) {
			stp.submit(st);
		}
		stp.shutdown();
	}

}
