package ObjectClassMethods;

public class A1 
{
	static String name="KGF";
	String chapter;
	double collections;
	A1(){}
	A1(String chapter,double collections)
	{
		this.chapter=chapter;
		this.collections=collections;
	}
	
	public String toString() 
	{
		return "A1 [name=" +name+ ",chapter=" + chapter + ", collections=" + collections + "]";
	}
	public boolean equals(Object o)
	{
		A1 f=(A1)o;
		return this.chapter==f.chapter && this.collections==f.collections; 
	}
	public void test()
	{
		System.out.println(this.name=name);
	}
	
	

}
