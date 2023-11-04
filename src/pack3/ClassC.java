package pack3;

public class ClassC 
{
	void meth1()
	{
		int x=10;
		System.out.println("meth1()called");
		System.out.println("X");
		new ClassC().meth2();
		System.out.println(x);
	}
	void meth2()
	{
		int y=99;
		System.out.println("meth2()called");
		System.out.println("Addition:" +(y+1));
		
	}

	public static void main(String[] args) 
	{
		System.out.println("start");
		System.out.println("java is awesome");
		new ClassC().meth1();
		System.out.println("end");

	}

}
