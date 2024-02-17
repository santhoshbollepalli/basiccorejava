package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class BeginwithJavaQ9 {
	void FindHCF() {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		int remainder;
		int hcf = 0;
		System.out.print("Enter the first number ");
		dividend = sc.nextInt();

		System.out.print("Enter the second number ");
		divisor = sc.nextInt();
		do {
			remainder = dividend % divisor;

			if (remainder == 0) {
				hcf = divisor;
			} else {
				dividend = divisor;
				divisor = remainder;
			}
 
		} while (remainder != 0);

		System.out.println("HCF: " + hcf);
		sc.close();
	}

	public static void main(String[] args) {
		BeginwithJavaQ9 bwjq9 = new BeginwithJavaQ9();
		bwjq9.FindHCF();
	}

}
