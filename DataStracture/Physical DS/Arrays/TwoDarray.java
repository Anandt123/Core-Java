package com.jspidersdatastractures.array;

import java.util.Scanner;

public class TwoDarray //clockwise...
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		char a[][]= new char[3][3];
		
		//{{'1','2','3'},{'4','5','a'},{'b','c','d'}};
		
		System.out.println("insert the elements :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.next().charAt(0);
			}
		}
		System.out.println("Elements inserted");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}		
		System.out.println("Clock wise array");
		for(int i=0;i<a.length;i++)
		{
			int j=0;
			System.out.print(" "+a[j][i]);
		}
		for(int i=1;i<a.length;i++)
		{
			int j=a.length-1;
			System.out.print(" "+a[i][j]);
		}
		for(int j=a.length-2;j>=0;j--)
		{			
			System.out.print(" "+a[2][j]);
		}
		
		for(int j=0;j<a.length-1;j++)
		{			
			System.out.print(" "+a[1][j]);
		}
	}

}
