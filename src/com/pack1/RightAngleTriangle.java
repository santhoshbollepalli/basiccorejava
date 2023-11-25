package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class RightAngleTriangle {
    Scanner sc = new Scanner(System.in);

    void meth1() {

        System.out.println("Enter the number of rows: ");
        int noOfRows = sc.nextInt();
        {
            for (int i = 1; i <= noOfRows; i++) {// for how many rows//

                for (int j = 1; j <= i; j++)// to print stars//
                    System.out.print("* ");
                System.out.println();
            }
            sc.close();
        }
    }

    public static void main(String[] args) {
        RightAngleTriangle aobj = new RightAngleTriangle();
        aobj.meth1();

    }

}
