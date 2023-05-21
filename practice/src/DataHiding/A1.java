package DataHiding;

public class A1 
{
	String name;
	int year;
	private String collections;
	public String getcollections()
	{
		return collections;
	}
	public void setcollections(String collections)
	{
		this.collections=collections;
	}
	A1(){}
	A1(String name,int year,String collections)
	{
		this.name=name;
		this.year=year;
		this.collections=collections;
	}
	public void display()
	{
		System.out.println("name:"+name);
		System.out.println("year:"+year);
		System.out.println("collections:"+collections);
	}

}
