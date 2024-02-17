package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class BeginwithJavaQ6 {
	void ReverseNumber() {
		Scanner sc = new Scanner(System.in);
		int number;
		int reverse = 0;
		System.out.println("Enter the number: ");
		number = sc.nextInt();
		int num = number;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse of " + number + " is " + reverse);
		sc.close();
	}
 
	public static void main(String[] args) {
		BeginwithJavaQ6 bwjq6 = new BeginwithJavaQ6();
		bwjq6.ReverseNumber();
	}

}
