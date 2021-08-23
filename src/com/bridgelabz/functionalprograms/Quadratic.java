package com.bridgelabz.functionalprograms;

public class Quadratic 
{
	public static void main(String[] args) 
	{

		int a = 2;
		int b = 4;
		int c = 1;
		double root1,root2,complexRoot;
		
		if (a == 0)
		{
			System.out.println("The roots are Invalid");
			return;
		}
		int delta = (b*b)-(4*a*c);
		if(delta == 0)
		{
			System.out.println("The roots are Real and Equal");
			root1 = (-b / (2 * a));
			System.out.println("Root 1 and Root 2: " + root1);

		} 
		else if(delta > 0)
		{
			System.out.println("The roots are Real and Unique");
			root1 = (-b + Math.sqrt(delta))/(2*a);
			root2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("Root 1: " + root1);
			System.out.println("Root 2: " + root2);
		}
		else 
		{
			System.out.println("The roots are Complex");
			root1 = -b / (2 * a);
			complexRoot = Math.sqrt(Math.abs(delta));
			System.out.println("Root 1: " + root1 + " +i" + complexRoot);
			System.out.println("Root 1: " + root1 + " -i" + complexRoot);
		}

	}

}
