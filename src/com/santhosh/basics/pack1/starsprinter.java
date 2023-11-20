package com.santhosh.basics.com.santhosh.basics.pack1;

import java.util.Scanner;
public class starsprinter
{
    Scanner sc =new Scanner(System.in);
    void meth1()
    {

        System.out.println("Enter the number of lines: ");
        int numberOfLines = sc.nextInt();
        for(int i=1; i<=numberOfLines; i++)
            System.out.println("******************");
        sc.close();
    }
    public static void main(String[] args)
    {
        starsprinter aobj= new starsprinter();
        aobj.meth1();

    }

}

