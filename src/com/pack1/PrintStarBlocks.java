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
    	for (int star = 0; star < numStars; star++) 
        {
            for (int line = 0; line < numLines; line++) 
            {
            	for (int block = 0; block < numBlocks; block++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
