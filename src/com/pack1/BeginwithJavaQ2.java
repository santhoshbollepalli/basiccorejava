package com.santhosh.basics.com.pack1;

public class BeginwithJavaQ2 {

	void sumoffirsttennaturals() {
		int sum = 0;
		System.out.println("Printing sum of first 10 natural numbers: " + "\n");
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("sum: " + sum);
	}

	public static void main(String[] args) {

		BeginwithJavaQ2 bwjq2 = new BeginwithJavaQ2();
		bwjq2.sumoffirsttennaturals();
	}

}
