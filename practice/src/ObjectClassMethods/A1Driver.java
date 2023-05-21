package ObjectClassMethods;

public class A1Driver {

	public static void main(String[] args) 
	{
		A1 f1=new A1("1",250);
		A1 f2=new A1("2",1250);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1.equals(f2));
		f1.test();

	}

}
