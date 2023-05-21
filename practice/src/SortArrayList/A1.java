package SortArrayList;

public class A1 implements Comparable
{
	String name;
	double collections;
	A1(){}
	A1(String name,double collections)
	{
		this.name=name;
		this.collections=collections;
	}
	
	public int compareTo(Object o) 
	{
		A1 f=(A1)o;
		if(this.collections==f.collections)
		{
		  return 0;
		}
		else if(this.collections>f.collections)
		{
			return +1;
		}
		else
		{
			return -1;
		}
		
	}
	
	public String toString() 
	{
		return "A1 [name=" + name + ", collections=" + collections + "]";
	}
	

}
