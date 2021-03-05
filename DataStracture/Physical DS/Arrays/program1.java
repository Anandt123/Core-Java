package com.jspidersdatastractures.array;

import java.util.Scanner;

public class program1 //program to display the elements of Array
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
	
	public static void output (int b[])
	{
		System.out.println("entered Array elements are : ");
		for(int i =0; i<b.length; i++)
		{	
			System.out.println("b["+i+"] : "+b[i]);
		}	
	}
	
	public static void main(String[] args) 
	{
		int size;
		System.out.println("Enter the size of array : ");
		size = sc.nextInt();
		
		int a[] = new int[size];
		int [] b = input(a);
		output(b);
	}
}
