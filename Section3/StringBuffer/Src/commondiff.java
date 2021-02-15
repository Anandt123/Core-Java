package stringbilder;

public class commondiff 
{
	public static void main(String[] args) 
	{
		System.out.println("----------------strings----------------------");
		String s1 = new String("hello");	//all the methods of object classes are overridden 
		String s2 = new String("hello");	//in strings class and here all the methods of object
											// classes should not be present like we can't use append keyword
		boolean b1 = s1.equals(s2);
		System.out.println(b1);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.toString());
		
		System.out.println(s1 + "world");
		
		System.out.println("----------------stringBuffer-----------------");
		
		StringBuffer sb1 = new StringBuffer("hello");//only tostring method of object class is overridden 
		StringBuffer sb2 = new StringBuffer("hello");//other methods should not overridden...
		
		boolean b2 = sb1.equals(sb2);
		System.out.println(b2);
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		
		System.out.println(sb1.append("world"));
		
		System.out.println("----------------stringBuilder-----------------");
		
		StringBuilder sbd1 = new StringBuilder("hello");//only tostring method of object class is overridden 
		StringBuilder sbd2 = new StringBuilder("hello");//other methods should not overridden...
				
		boolean b3 = sbd1.equals(sbd2);
		System.out.println(b3);
				
		System.out.println(sbd1.hashCode());
		System.out.println(sbd2.hashCode());
				
		System.out.println(sbd1.toString());
		System.out.println(sbd2.toString());
				
		System.out.println(sbd1.append("world")); 
	}

}
