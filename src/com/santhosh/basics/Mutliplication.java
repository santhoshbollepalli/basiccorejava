package com.santhosh.basics.com.santhosh.basics;

public class Mutliplication 
{

	public void meth1()
	{
		int num=5;
		for(int i=1;i<=10;++i)
	    System.out.printf("%d * %d = %d \n", num, i, num * i);
	}
	public static void main(String[] args) 
	{
		Mutliplication aobj= new Mutliplication();
		aobj.meth1();	
	}

}
