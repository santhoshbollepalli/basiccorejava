package com.santhosh.basics.com.pack1;

import java.io.IOException;

public class Print2darray {
    public static void print2D(int mat[][]) {
        for (int i = 0; i < mat.length; i++)// Loop through all rows
            for (int j = 0; j < mat[i].length; j++)// Loop through all elements of current row
                System.out.print(mat[i][j] + " ");
    }

    public static void main(String args[])
            throws IOException {
        int mat[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        print2D(mat);
    }
}
