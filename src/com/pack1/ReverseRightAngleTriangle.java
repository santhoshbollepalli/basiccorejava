package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class ReverseRightAngleTriangle 
{
	Scanner sc= new Scanner(System.in);
	void meth1()
	{
		
		System.out.println("Enter the no of rows: ");
		int rows= sc.nextInt();
		{
			for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
			}
			System.out.println();		
		}
		sc.close();
		}
	}
	public static void main(String[] args) 
	{
		ReverseRightAngleTriangle aobj= new ReverseRightAngleTriangle();
		aobj.meth1();
	}

}
