package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class BeginwithJavaQ8 {
	void TestPrime() {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.print("Enter the positive integer: ");
		number = sc.nextInt();

		boolean flag = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag && number > 1) {
			System.out.println("Number is prime");
		} 
		else {
			System.out.println("Number is not prime");
		}
		sc.close();
	}
 
	public static void main(String[] args) {

		BeginwithJavaQ8 bwjq8 = new BeginwithJavaQ8();
		bwjq8.TestPrime();
	}
}
