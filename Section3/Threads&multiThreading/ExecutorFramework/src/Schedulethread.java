package com.jspiders.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Backuptask implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Task executed..");
	}
}
class LoadpostTask implements Runnable
{
	@Override
	public void run() {
		System.out.println("load all Posts...");
	}
}
public class Schedulethread 
{
	public static void main(String[] args) 
	{
		Backuptask t1 = new Backuptask();
		LoadpostTask l1 = new LoadpostTask();
		
		int cores = Runtime.getRuntime().availableProcessors();
		
		System.out.println("cores : "+cores);
		
		ScheduledExecutorService stp = Executors.newScheduledThreadPool(cores);
		stp.scheduleAtFixedRate(t1, 2, 5, TimeUnit.SECONDS);
		stp.schedule(l1, 6, TimeUnit.SECONDS);
		
	}

}
