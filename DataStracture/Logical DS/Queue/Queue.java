package com.jspidersdatastractures.Queue;

public class Queue {
	int arr[];
	int startPointer;
	int endPointer;
	
	public Queue (int size) {
		this.arr = new int[size];
		this.startPointer = -1;
		this.endPointer = -1;
		System.out.println("Queue is created with size : "+size);
	}
	
	public void enQueue(int valueToBeInsert) {
		if(isQueueFull()) {
			System.out.println("Queue Overflow !!");
			return;
		}else {
			arr[startPointer+1] = valueToBeInsert;
			startPointer++;
		}
	}
	
	public void deQueue() {
		if(isQueueEmpty()) {
			System.out.println("Queue Underflow !!");
			return;
		}else {												//in Queue delete will be done using
			System.out.println("value : "+arr[endPointer+1]);//FIFO-first in first out...
			endPointer++;									
		}
	}
	
	
	public boolean isQueueFull() {
		if(startPointer == arr.length - 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isQueueEmpty() {
		if(startPointer == -1) {
			return true;
		}else {
			return false;
		}
	}
}