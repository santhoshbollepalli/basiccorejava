package com.santhosh.basics.com.pack1;

import java.util.Arrays;

public class ArrayEqualsorNot {
    void arraysequalornot() {
        int a[] = {30, 25, 40};
        int b[] = {30, 25, 40};
        boolean result = Arrays.equals(a, b);// Arrays.equals(a, b) function is used to check whether two arrays are equal or not
        {
            if (result == true) // condition to check whether the result is true or false
            {
                System.out.println("Two arrays are equal");
            } else {
                System.out.println("Two arrays are not equal");
            }
        }
    }

    public static void main(String[] args) {
        ArrayEqualsorNot myarray = new ArrayEqualsorNot();
        myarray.arraysequalornot();
    }
}



