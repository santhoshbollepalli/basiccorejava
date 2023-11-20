package com.santhosh.basics.com.santhosh.basics;

public class ClassB 
{

	void meth1()
	{
		System.out.println("Printing even values between 1 to 100: ");
		for(int i=1;i<=100;i++)
		if(i%2==0)
		{
		System.out.println("ivalue :" +i);
		}
		
	}

	public static void main(String[] args) 
	{
		ClassB bobj=new ClassB();
		bobj.meth1();

	}

}
