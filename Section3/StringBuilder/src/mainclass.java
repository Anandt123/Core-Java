package stringbilder;

public class mainclass {

	public static void main(String[] args) 
	{
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
				
		boolean b1 = sb1.equals(sb2);
		System.out.println(b1);
				
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
				
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
				
		System.out.println(sb1.append("world")); 
	}
}