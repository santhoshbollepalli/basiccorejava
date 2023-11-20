package com.santhosh.basics.com.santhosh.basics;

import java.util.Scanner;

public class Volumeofcube 
{
	Scanner sc= new Scanner(System.in);
	void meth5() 
	{
		int side, volume;
		System.out.println("Enter the side of the cube:");
		side=sc.nextInt();
		volume=side*side*side;
		System.out.println("Volume of the cube :"+volume);
	}

	public static void main(String[] args) 
	{
		Volumeofcube aobj=new Volumeofcube();
		aobj.meth5();
	}

}
