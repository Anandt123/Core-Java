package stringbuffer;

public class mainclass 
{

	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		
		boolean b1 = sb1.equals(sb2);
		System.out.println(b1);
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		
		System.out.println(sb1.append("world")); 
	}

}
