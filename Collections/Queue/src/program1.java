package com.Collection.Queue;

import java.util.PriorityQueue;

public class program1 {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();
		
		queue.offer("JAVA");
		queue.offer("SQL");
		queue.offer("HTML");
		queue.offer("css");
		//queue.poll();
		
		System.out.println(queue);
		
		queue.add("Java");
		queue.add("SQL");
		queue.add("HTML");
		queue.add("CSS");
		
		System.out.println(queue);
	}

}
