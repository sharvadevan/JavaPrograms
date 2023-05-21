package CompareNonHomogeneousCollection;

import java.util.ArrayList;
import java.util.Collections;

public class A1Driver {

	public static void main(String[] args) 
	{
		ArrayList  al1=new ArrayList();
		al1.add(new A1("kgf2",1250));
		al1.add(new A1("kgf1",250));
		System.out.println(al1);
		for(Object obj:al1)
		{
			System.out.println(obj);
		}
		Collections.sort(al1);
		System.out.println("after sorting");
		System.out.println(al1);
		for(Object obj:al1)
		{
			System.out.println(obj);
		}

	}

}
