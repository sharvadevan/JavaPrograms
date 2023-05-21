package BetweenPrimeNumbers;

public class A1 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			int num=i;
			int count=0;
			int j=2;
			while(j<num)
			{
				if(num%j==0)
				{
					count++;
					break;
				}
				j++;
				
			}
			if(count==0)
			{
				System.out.println(num);
			}
		}

	}

}
