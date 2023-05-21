package PrimeNumberOrNot;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int count=0;
		int a=2;
		while(a<num)
		{
			if(num%a==0)
			{
				count++;
			}
			a++;
		}
		if(count==0)
		{
			System.out.println("given number is a prime number");
		}
		else
		{
			System.out.println("given number is not a prime number");
		}
	}

}
