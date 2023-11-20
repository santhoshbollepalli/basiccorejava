package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class numberofstarlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars: " + "\n");
        int numStars = sc.nextInt();
        System.out.print("Enter the number of lines: " + "\n");
        int numLines = sc.nextInt();
        sc.close();
        printStarsLines(numLines, numStars);
    }

    public static void printStarsLines(int numLines, int numStars) {
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numStars; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

