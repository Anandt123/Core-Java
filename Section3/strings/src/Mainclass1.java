package strings;

public class Mainclass1 
{

	public static void main(String[] args) 
	{
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		boolean b1 = s1.equals(s2);
		System.out.println(b1);
		
		System.out.println(s1.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
