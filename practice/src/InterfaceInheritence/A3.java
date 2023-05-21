package InterfaceInheritence;

public class A3 extends A4 implements A1,A2
{

	public static void main(String[] args) 
	{
		A3 obj=new A3();
		obj.test1();
		obj.test2();
		obj.test4();
		
		System.out.println(a);
		System.out.println(b);

	}

	@Override
	public void test2() 
	{
		
		System.out.println(2);
	}

	@Override
	public void test1() 
	{
		
		System.out.println(1);
	}

}
