package Factorial;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("factorial of given number is:"+fact);

	}

}
