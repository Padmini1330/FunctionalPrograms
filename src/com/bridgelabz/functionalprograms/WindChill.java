package com.bridgelabz.functionalprograms;

import java.util.Scanner;
public class WindChill {

	public static void main(String[] args) {
		
		Scanner object=new Scanner(System.in);
		System.out.println("Enter Temperature and wind speed");
		double t = object.nextDouble();
        double v = object.nextDouble();
        if(t > 50 || v >120 || v < 3)
        {
        	System.out.println("Enter the proper values");
        }
        else
        {
        	double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
            System.out.println("Temperature = " + t);
            System.out.println("Wind speed  = " + v);
            System.out.println("Wind chill  = " + w);
        }
        
		

	}

}
