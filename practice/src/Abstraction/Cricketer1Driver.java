package Abstraction;

public class Cricketer1Driver implements Cricketer1
{
	int a=9;

	public static void main(String[] args) 
	{
		Cricketer1Driver obj1=new Cricketer1Driver();
		obj1.dravid();
		obj1.dhoni();
		obj1.sachin();
		

	}

	@Override
	public void dravid() 
	{
		System.out.println("name:Rahul Dravid");
		System.out.println("nation:India");
		System.out.println(a);
		
		
	}

	@Override
	public void sachin() 
	{
		System.out.println("name:Sachin Tendulkar");
		System.out.println("nation:India");
		
	}

	@Override
	public void dhoni() 
	{
		System.out.println("name:M S Dhoni");
		System.out.println("nation:India");
		
	}

}
