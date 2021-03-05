package com.jspidersdatastractures.array;

import java.util.Scanner;

public class program5 //To display 2D array using Scanner...
{
	static Scanner sc = new Scanner(System.in);
	
	public static int[][] input(int a[][])
	{
		System.out.print("enter array elements : ");
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) 
			{
				a[row][col] = sc.nextInt();
			}
		}
		return a;
		
	}
	public static void output(int a[][])
	{
		System.out.println("entered array elements are : ");
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) 
			{
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		System.out.print("Enter row value : ");
		int row = sc.nextInt();
		System.out.print("Enter col value : ");
		int col = sc.nextInt();
		int [][]a = new int[row][col];
		
		int res[][] = input(a);
		
		output(res);
	}
}
