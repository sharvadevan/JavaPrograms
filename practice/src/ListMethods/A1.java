package ListMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class A1 {

	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		System.out.println(al1);
		System.out.println("******");
		Iterator i1=al1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
	}

}
