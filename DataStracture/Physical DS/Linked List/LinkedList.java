package com.jspidersdatastractures.linkedlist;

public class LinkedList 
{
	private singlenode head = null;
	private singlenode tail = null;
	private int size = 0;
	
	public LinkedList(int valueToBeInsert)
	{
		singlenode node = new singlenode();
		node.setValue(valueToBeInsert);
		node.setNext(null);
		head = node;
		tail = node;
		setSize(1);
	}
	
	public void insert(int valueToBeInsert,int location)
	{
		singlenode node = new singlenode();
		node.setValue(valueToBeInsert);
		
		if(!existsLinkedList()){
			System.out.println("linkedList doesnot exists !");
			return;
		}else if(location==0){
			node.setNext(head);
			head = node;
		}else if(location>=size){
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else{
			singlenode tempNode = head;
			int index = 0;
			while(index<location-1){
				tempNode = tempNode.getNext();
				index++;
			}
			singlenode newNode = tempNode.getNext();
			tempNode.setNext(node);
			node.setNext(newNode);
		}
		setSize(getSize()+1);
	}
	
	public void traverseLinkedList() {
		if(!existsLinkedList()) {
			System.out.println("LinkedList does not exist !");
			return;
		}else {
			singlenode tempNode = head;
			
			for (int i = 0; i < getSize(); i++) {
				System.out.println("value at location : "+i+" is : "+tempNode.getValue());
				tempNode = tempNode.getNext();
			}
		}
	}
	
	public void search(int valueToBeSearch) {
		if(!existsLinkedList()) {
			System.out.println("LinkedList does not exist !");
			return;
		}else {
			singlenode tempNode = head;
			for (int i = 0; i < getSize(); i++) {
				if(tempNode.getValue()==valueToBeSearch) {
					System.out.println("valueToBeSearch is found at location : "+i);
					return;
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("valueToBeSearch is not found");
		}
	}
	
	public void delete(int location) {
		if(!existsLinkedList()) {
			System.out.println("LinkedList does not exist !");
			return;
		}else if(location == 0){
			head = head.getNext();
			
			if(head == null) {
				tail=null;
			}
			setSize(getSize()-1);
		}else if(location >= size) {
			singlenode tempNode = head;
			
			for (int i = 0; i < getSize()-1; i++) {
				tempNode = tempNode.getNext();
			}
			
			if(tempNode == head) {
				head = tail = null;
				setSize(getSize()-1);
				return;
			}
			tempNode.setNext(null);
			tail = tempNode;
			setSize(getSize()-1);
		}else {
			singlenode tempNode = head;
			for (int i = 0; i < location-1; i++) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(tempNode.getNext().getNext());
			setSize(getSize()-1);
		}
		
	}
	public boolean existsLinkedList()
	{
		return head != null;
	}
	
	public singlenode getHead() {
		return head;
	}
	public void setHead(singlenode head) {
		this.head = head;
	}
	public singlenode getTail() {
		return tail;
	}
	public void setTail(singlenode tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
}
