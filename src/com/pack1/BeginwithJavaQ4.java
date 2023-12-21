package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class BeginwithJavaQ4 {
	void factroial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to find factorial: " + "\n");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("fact: " + fact);
		sc.close();
	}

	public static void main(String[] args) {

		BeginwithJavaQ4 bwjq4 = new BeginwithJavaQ4();
		bwjq4.factroial();
	}

}
