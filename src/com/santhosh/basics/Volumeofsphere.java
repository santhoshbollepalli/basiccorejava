package com.santhosh.basics.com.santhosh.basics;

import java.util.Scanner;

public class Volumeofsphere 
{
	Scanner sc= new Scanner(System.in);
    void meth4() 
    {
    	double radius,volume;
    	System.out.println("Enter the raduis of the sphere:");
    	radius=sc.nextDouble();
    	volume=((double)4/3*3.14*radius*radius*radius);// Volume of sphere = 4/3*3.14(pie)*r*r*r//
    	System.out.println("Volume of the sphere:"+volume);
    	
    }
	public static void main(String[] args) 
	{
		Volumeofsphere dobj=new Volumeofsphere();
		dobj.meth4();

	}

}
