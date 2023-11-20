package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class starsprinter {
    Scanner sc = new Scanner(System.in);

    void meth1() {


        System.out.println("Enter the number of stars: ");
        int numberOfStars = sc.nextInt();
        for(int i=1; i<=numberOfStars; i++)
            System.out.print("*");
        sc.close();
    }

    public static void main(String[] args) {
        starsprinter aobj = new starsprinter();
        aobj.meth1();

    }

}

