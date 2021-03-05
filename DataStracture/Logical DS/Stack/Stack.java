package com.jspidersdatastractures.Stack;

public class Stack {
	int arr[];
	int startPointer;
	
	public Stack(int size) {
		this.arr = new int[size];
		this.startPointer = -1;
		System.out.println("stack is created with size : "+size);
	}
	
	public void push(int valueToBeInsert) {
		if(isStackFull()) {
			System.out.println("Stack Overflow !!");
			return;
		}else {
			arr[startPointer+1] = valueToBeInsert;
			startPointer++;
		}
	}
	
	public void pop() {
		if(isStackEmpty()) {
			System.out.println("Stack Underflow !!");
			return;
		}else {
			System.out.println("value : "+arr[startPointer]);
			startPointer--;
		}
	}
	
	public void peak() {
		if(isStackEmpty()) {
			System.out.println("Stack Underflow !!");
			return;
		}else {
			System.out.println("value : "+arr[startPointer]);
		}
	}
	
	public boolean isStackFull() {
		if(startPointer == arr.length - 1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isStackEmpty() {
		if(startPointer == -1) {
			return true;
		}else {
			return false;
		}
	}
}
