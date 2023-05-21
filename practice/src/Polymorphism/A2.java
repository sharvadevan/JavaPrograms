package Polymorphism;

public class A2 extends A1
{
	int a=2;
	public static void test1()
	{
		System.out.println("2");
	}
	

	public static void main(String[] args) 
	{
		
		A1 obj1=new A2();
		
		System.out.println(obj1.a);
		obj1.test1();
		

	}

}
