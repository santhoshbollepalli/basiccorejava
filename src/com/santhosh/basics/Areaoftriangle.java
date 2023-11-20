package com.santhosh.basics.com.santhosh.basics;

import java.util.Scanner;

public class Areaoftriangle {
    Scanner sc = new Scanner(System.in);

    void meth3() {
        int base, height, area;
        System.out.println("Enter the base of the triangle:");
        base = sc.nextInt();
        System.out.println("Enter the height of the triangle:");
        height = sc.nextInt();
        area = ((base * height) / 2);// Area of triangle = 1/2(b*h)//
        System.out.println("Area of the triangle:" + area);
    }

    public static void main(String[] args) {
        Areaoftriangle cobj = new Areaoftriangle();
        cobj.meth3();
    }

}
