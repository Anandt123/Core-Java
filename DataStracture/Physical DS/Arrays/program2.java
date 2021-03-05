package com.jspidersdatastractures.array;

import java.util.Scanner;

public class program2 //Program to display first,middle,last element of array
{						//using Scanner or by taking user input...
	
	static Scanner sc = new Scanner(System.in);
	
	public static int[] input (int a[])
	{
		System.out.println("enter the Array element : ");
		for(int i =0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
			
		}
		return a;
	}
	
	/*public static void output (int b[])
	{
		System.out.println("entered Array elements are : ");
		for(int i =0; i<b.length; i++)
		{	
			System.out.println("b["+i+"] : "+b[i]);
		}
	}*/
	
	public static void print(int a[])
	{
		int firstElement = a[0];
		int middleElement = a[(a.length-1)/2];
		int lastElement = a[a.length-1];
		
		System.out.println("firstElement : "+firstElement);
		System.out.println("middleElement : "+middleElement);
		System.out.println("lastElement : "+lastElement);
	}
	public static void main(String[] args) 
	{
		int size;
		System.out.println("Enter the size of array : ");
		size = sc.nextInt();
		
		int a[] = new int[size];
		int b[]  = input(a);
		//output(b);
		print(b);

	}

}
