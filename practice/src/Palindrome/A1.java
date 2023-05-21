package Palindrome;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc1.nextInt();
		int num1=num;
		int rev=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(num1==rev)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		

	}

}
