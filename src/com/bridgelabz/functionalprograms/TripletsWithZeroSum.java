package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class TripletsWithZeroSum 
{

	public static void main(String[] args) 
	{

		System.out.print("Enter the value of Number of elements: ");
		Scanner object=new Scanner(System.in);
		int numberOfElements=object.nextInt();
		System.out.println("Enter the "+numberOfElements+" integers");
		int array[]=new int[numberOfElements];
		int noOfTriplets=0;
		for(int index=0;index<numberOfElements;index++)
		{
			array[index]=object.nextInt();
		}
		for(int index1=0;index1<numberOfElements;index1++)
		{
			for(int index2=index1+1;index2<numberOfElements;index2++)
			{
				for(int index3=index2+1;index3<numberOfElements;index3++)
				{
					int sum=array[index1]+array[index2]+array[index3];
					if(sum==0)
					{
						noOfTriplets++;
					}
				}
				
			}
		}
		System.out.println("Number of Distinct triplets: "+noOfTriplets);
	
	}

}



