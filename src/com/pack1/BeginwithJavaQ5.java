package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class BeginwithJavaQ5 {
	void baseandpower() {
		Scanner sc = new Scanner(System.in);
		int base;
		int power;
		int result = 1;
		System.out.println("Enter the base: " + "\n");
		base = sc.nextInt();
		System.out.println("Enter the power: " + "\n");
		power = sc.nextInt();
		for (int i = 1; i <= power; i++) {
			result =  result*base ;
		}
		System.out.println("Result :" + result);
		sc.close();
	}

	public static void main(String[] args) {
		BeginwithJavaQ5 bwjq5 = new BeginwithJavaQ5();
		bwjq5.baseandpower();
	}

}
