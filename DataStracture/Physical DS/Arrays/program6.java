package com.jspidersdatastractures.array;

public class program6 	//To display required pattern Using Array
{
	public static void Print(int a[][])
	{
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				
				if (a[row][col]==1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) 
	{
		int [][]a  =  { {1,0,0,0,1},
						{1,1,0,0,1},
						{1,0,1,0,1},
						{1,0,0,1,1},
						{1,0,0,0,1}
						};
		Print(a);
	}

}
