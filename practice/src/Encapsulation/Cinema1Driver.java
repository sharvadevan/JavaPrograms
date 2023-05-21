package Encapsulation;

public class Cinema1Driver {

	public static void main(String[] args) 
	{
		Cinema1 c1=new Cinema1("avane srimannarayana",100);
		Cinema1 c2=new Cinema1("interstellar",6000);
		Cinema1 c3=new Cinema1("aarya2",90);
		c1.display();
		c2.display();
		c3.display();
		System.out.println("******");
		c1.setCollections(102);
		c2.setCollections(6003);
		c3.setCollections(99);
		c1.display();
		c2.display();
		c3.display();
	}

}
