package com.santhosh.basics.com.pack1;

public class Addtwomatrices {
    static void printMatrix(int M[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }

    static int[][] add(int A[][], int B[][], int size) {// Function to add the two matrices and store in matrix C
        int i, j;
        int C[][] = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];

        return C;
    }

    public static void main(String[] args) {
        int size = 4;

        int A[][] = {{10, 10, 10, 10},
                {20, 20, 20, 20},
                {30, 30, 30, 30},
                {40, 40, 40, 40}};
        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);

        int B[][] = {{1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);
        int C[][] = add(A, B, size);
        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);
    }

}

