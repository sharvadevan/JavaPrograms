package ArrayListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class A1 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(20);
		al.add(10);
		al.add(30);
		System.out.println(al);
		System.out.println("*********");
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("*********");
		Collections.sort(al);
		System.out.println(al);
		
		
		

	}

}
