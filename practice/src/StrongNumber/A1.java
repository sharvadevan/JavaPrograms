package StrongNumber;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		int unit=0;
		
		while(num>0)
		{
			int r=1;
			unit=num%10;
			while(unit>0)
			{
				
				r=r*unit;
				unit--;
				
			}
			sum=sum+r;
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println("given number is a strong number");
		}
		else
		{
			System.out.println("given number is not a strong number");
		}

	}

}
