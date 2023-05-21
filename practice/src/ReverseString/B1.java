package ReverseString;

public class B1 {

	public static void main(String[] args) 
	{
		String s1="hello";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s1.charAt(i)+s2;
		}
		System.out.println("reverse of given string is:"+s2);
	}

}
