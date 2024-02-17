package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class BeginwithJavaQ7 {
	void SetOfIntegers() {
		Scanner sc = new Scanner(System.in);
		int number;
		int evensum = 0;
		int oddsum = 0;
		char choice;

		do {
			System.out.println("Enter the number: ");
			number = sc.nextInt();
			if (number % 2 == 0) {
				evensum = evensum + number;
			} else {
				oddsum = oddsum + number;
			}
			System.out.println("Do you want to continue y/n ?");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
		System.out.println("Sum of even numbers: " + evensum);
		System.out.println("Sum of odd numbers: " + oddsum);
		sc.close();
	}
 
	public static void main(String[] args) {
		BeginwithJavaQ7 bwjq7 = new BeginwithJavaQ7();
		bwjq7.SetOfIntegers();
	}

}
