package com.santhosh.basics.com.santhosh.basics;

public class Factorial 
{
	public void meth1()
	{
	int num = 10;
    long factorial = 1;
    for(int i = 1; i <=num; ++i)
    {
         factorial = factorial * i;   
    }
    System.out.printf("Factorial of number"+" "+num+" :"+factorial);
	}

	public static void main(String[] args) 
	{
		Factorial aobj =new Factorial();
		aobj.meth1();
	}
}
