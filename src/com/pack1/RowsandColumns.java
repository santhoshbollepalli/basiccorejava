package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class RowsandColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = sc.nextInt();
        int[][] arr = new int[numRows][numCols];
        System.out.println("Matrix created with " + numRows + " rows and " + numCols + " columns.");
        System.out.println("Matrix Elements:");
        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j < numCols; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
