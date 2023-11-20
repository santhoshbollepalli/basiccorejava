package com.santhosh.basics.com.santhosh.basics;

import java.util.Scanner;

public class Volumeofcuboid 
{
	Scanner sc= new Scanner(System.in);
	void meth6() 
	{
		int length, breadth, height, volume;
		System.out.println("Enter the length of the cuboid :");
		length=sc.nextInt();
		System.out.println("Enter the breadth of the cuboid :");
		breadth=sc.nextInt();
		System.out.println("Enter the height of the cuboid");
		height=sc.nextInt();
		volume=length*breadth*height;
		System.out.println("Volume of the cuboid :"+volume);	
	}

	public static void main(String[] args) 
	{
		Volumeofcuboid bobj=new Volumeofcuboid();
		bobj.meth6();
	}

}
