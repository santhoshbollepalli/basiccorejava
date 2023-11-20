package com.santhosh.basics.com.santhosh.basics;

import java.util.Scanner;

public class Areaofrecatngle 
{
	Scanner sc= new Scanner(System.in);
	void meth2()
	{
		int length,breadth, area;
		System.out.println("Enter the length of the rectangle:");
		length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle:");
		breadth=sc.nextInt();
		area= length*breadth;
		System.out.println("Area of the rectangle:"+area);
	}
	public static void main(String[] args) 
	{
		Areaofrecatngle bobj=new Areaofrecatngle();
		bobj.meth2();
	}

}
