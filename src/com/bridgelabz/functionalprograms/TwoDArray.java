package com.bridgelabz.functionalprograms;

import java.util.Scanner;
public class TwoDArray 
{

	public static void main(String[] args) 
	{
		Scanner object=new Scanner(System.in);
		System.out.println("Enter number of Rows and Columns:");
		int mRows=object.nextInt();
		int nColumns=object.nextInt();
		int twoDArray[][]=new int[mRows][nColumns];
		System.out.println("Enter "+(mRows*nColumns)+" array elements:");
		for(int rowIndex=0;rowIndex<mRows;rowIndex++)
		{
			for(int columnIndex=0;columnIndex<nColumns;columnIndex++)
			{
				twoDArray[rowIndex][columnIndex]=object.nextInt();
			}
		}
		
		System.out.println("number of rows:"+ mRows+" "+ "number of columns:"+ nColumns);
		for(int rowIndex=0;rowIndex<mRows;rowIndex++)
		{
			for(int columnIndex=0;columnIndex<nColumns;columnIndex++)
			{
				System.out.print(twoDArray[rowIndex][columnIndex] + " ");
			}
			System.out.println();
		}
		

	}

}