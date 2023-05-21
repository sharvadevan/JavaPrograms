package Fibonacci;

public class A1 {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=0;
		while(c<21)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			c=c;
		}

	}

}
