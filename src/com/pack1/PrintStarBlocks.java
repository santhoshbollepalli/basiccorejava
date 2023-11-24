package com.santhosh.basics.com.pack1;

import java.util.Scanner;

public class PrintStarBlocks 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stars: ");
        int numStars = scanner.nextInt();
        System.out.print("Enter the number of lines : ");
        int numLines = scanner.nextInt();
        System.out.print("Enter the number of blocks: ");
        int numBlocks = scanner.nextInt();
        scanner.close();
        printStarsBlocks(numStars, numLines, numBlocks);
    }
    public static void printStarsBlocks(int numBlocks, int numLines, int numStars) 
    {
    	for (int i = 0; i < numStars; i++)
        {
            for (int j = 0; j < numLines; j++)
            {
            	for (int k = 0; k < numBlocks; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
