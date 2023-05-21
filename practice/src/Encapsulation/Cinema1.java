package Encapsulation;

public class Cinema1 
{
	String name;
	private double collections;
	public double getCollections() 
	{
		return collections;
	}
	public void setCollections(double collections)
	{
		this.collections = collections;
	}
	Cinema1(){}
	Cinema1(String name,double collections)
	{
		this.name=name;
		this.collections=collections;
	}
	public void display()
	{
		System.out.println("name:"+name);
        System.out.println("collections:"+collections);
	}
	

}
