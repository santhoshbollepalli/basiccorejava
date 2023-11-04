package pack2;

public class ClassB 
{
public void meth1()
{
	System.out.println("meth1()called");
	System.out.println("hi");
}
public void meth2()
{
	System.out.println("meth2()called");
	System.out.println("hello");
}
public static void main(String[] args) 
{
    System.out.println("start");
     new ClassB().meth1();
     new ClassB().meth2();
     System.out.println("java is awesome");
     System.out.println("end");
}
}
