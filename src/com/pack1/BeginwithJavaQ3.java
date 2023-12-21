package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class BeginwithJavaQ3 {

    void positiveintgertable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to perform mutliplication: " + "\n");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
            sc.close();
        }
    }

    public static void main(String[] args) {

        BeginwithJavaQ3 bwjq3 = new BeginwithJavaQ3();
        bwjq3.positiveintgertable();
    }

}
