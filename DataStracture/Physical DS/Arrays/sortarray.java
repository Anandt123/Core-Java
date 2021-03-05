package com.jspidersdatastractures.array;

import java.util.Scanner;

public class sortarray 
{
	static Scanner sc = new Scanner(System.in);
	
	public static int[] input (int a[])
	{
		System.out.println("enter the Array element : ");
		for(int i =0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			for(int k=j+1; k<a.length; k++)
			{
				if(a[j]>a[k])
				{
				//int temp = a[j];
					//a[j] = a[k];
					//a[k] = temp;
					//a[j]=a[j]+a[k];
					//a[k]=a[j]-a[k];
					//a[j]=a[j]-a[k];
					
					a[j]=a[j]^a[k];
					a[k]=a[j]^a[k];
					a[j]=a[j]^a[k];
				}
			}
		}
		return a;
	}
	
	public static void print1 (int b[])
	{
		System.out.println("entered Array elements in ascending order : ");
		for(int i =0; i<b.length; i++)
		{	
			System.out.print(" "+b[i]);
		}	
		System.out.println();
	}
	public static void print2 (int b[])
	{
		System.out.println("entered Array elements in decending order : ");
		for(int i =b.length-1; i>=0; i--)
		{	
			System.out.print(" "+b[i]);
		}	
	}
	public static void main(String[] args) 
	{
		int size;
		System.out.println("Enter the size of array : ");
		size = sc.nextInt();
		
		int a[] = new int[size];
		int [] b = input(a);
		print1(b);
		print2(b);
	}
}
