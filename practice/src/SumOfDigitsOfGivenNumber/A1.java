package SumOfDigitsOfGivenNumber;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc1.nextInt();
		int unit=0;
		int sum=0;
		while(num>0)
		{
			unit=num%10;
			sum=sum+unit;
			num=num/10;
		}
		System.out.println("sum of digits of given number is:"+sum);
	}

}
