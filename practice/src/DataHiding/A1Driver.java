package DataHiding;

public class A1Driver {

	public static void main(String[] args) 
	{
		A1 f1=new A1("batman",2009,"100 cr");
		A1 f2=new A1("superman",2005,"90cr");
		f1.display();
        f2.display();
        System.out.println(f1.getcollections());
        f1.setcollections("120 cr");
        f1.display();
        System.out.println(f2.getcollections());
        f2.setcollections("100 cr");
        f2.display();
        
	}

}
