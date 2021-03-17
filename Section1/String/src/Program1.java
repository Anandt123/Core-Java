class Program1
{
	public static void main(String[] args) 
	{
		System.out.println("program starts....");
		String str="anandkumar";
		String str1="ANANDKUMAR";

		int len = str.length();
		System.out.println(len);

		char ch1=str.charAt(4);
		System.out.println(ch1);

		int i1=str.indexOf('d');
		System.out.println(i1);

		int i2=str.indexOf('a',3);
		System.out.println(i2);

		boolean b1=str.equals(str1);
		System.out.println(b1);	

		boolean b2=str.equalsIgnoreCase(str1);
		System.out.println(b2);

		String sub=str.substring(0,5);
		System.out.println(sub);

		System.out.println("program ends...");
	}
}