package PowerAndBase;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int base=sc.nextInt();
		System.out.println("enter power");
		int power=sc.nextInt();
		int res = 1;
		while(power>0)
		{
			res=res*base;
			power--;
		}
		System.out.println("result is:"+res);

	}

}
