package Inheritence;

public class Movie2 extends Movie1 
{
	String name2;
	Movie2(){}
	Movie2(String name2)
	{
		this.name2=name2;
	}
	public void rating2()
	{
		System.out.println(name2);
		System.out.println("85%");
	}

}
