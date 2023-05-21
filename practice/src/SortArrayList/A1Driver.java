package SortArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A1Driver {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(new A1("BATMAN",100));
		al.add( new A1("SUPERMAN",90));
		System.out.println(al);
		System.out.println("*********");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("*********");
		for(Object obj:al)
		{
			System.out.println(obj);
			
		}
	}

}
