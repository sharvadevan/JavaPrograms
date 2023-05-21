package CustomException;

public class A2 
{
	String name;
	double salary;
	A2(){}
	A2(String name,double salary) throws Throwable
	{
		this.name=name;
		if(salary<0)
		{
			System.out.println("salary cant be less than zero");
			throw new A1();
		}
		else
		{
			this.salary=salary;
		}
		
	}
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("salary:"+salary);
	}
	

}
