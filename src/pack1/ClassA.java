package pack1;

public class ClassA 
{
	  int meth1(int x, int y)
	{
	System.out.println("meth1()called");
	return x+y;
	}
	public static void main(String[] args) 
	{
		ClassA aobj=new ClassA();
		System.out.println("java is awesome");
		aobj.meth1(12, 15);
		System.out.println("end");

	}

}
