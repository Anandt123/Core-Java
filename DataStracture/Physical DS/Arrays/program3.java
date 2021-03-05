package com.jspidersdatastractures.array;

import java.util.Scanner;

public class program3 //display array in reverse order
{
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
		for(int i=b.length-1; i>=0; i--)
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
