package com.santhosh.basics.com.santhosh.basics;

public class Gcdoftwonumbers 
{
	void meth1()
	{
		 int i1 = 81,i2 = 153;
		 int gcd = 1;
		 for (int i=1;i<=i1 && i<=i2; i++)
		 {
			 if (i1%i== 0 && i2%i==0)
			 gcd=i;
		 }
			 System.out.println("GCD of"+" "+i1+" "+"and"+" "+i2+" "+"is"+": "+gcd);
	}

	public static void main(String[] args) 
	{
		Gcdoftwonumbers aobj =new Gcdoftwonumbers();
		aobj.meth1();
	}

}
