package PrintNToN;

public class A2 {

	public static void main(String[] args) 
	{
		A2.print(2);

	}
	public static void print(int n)
	{
		if(n==100)
		{
			return;
		}
		System.out.println(n);
		n++;
		print(n);
	}

}
