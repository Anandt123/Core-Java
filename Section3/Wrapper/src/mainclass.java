package wrapper;

public class mainclass 
{
	public static int add(int a1, int b1)
	{
		int sum = a1 + b1;
		return sum;
	}
	public static double add(double a1, double b1)
	{
		double sum = a1 + b1;
		return sum;
	}
	public static String add(String a1, String b1)
	{
		String sum = a1+b1;
		return sum;
	}
	public static void printoutput(Object obj)
	{
		System.out.println("printoutput(Object obj)");
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		int res1 = add(10,10);
		Integer i1 = new Integer(res1);
		printoutput(i1);
		
		double res2 = add(10.1,1.1);
		Double d1 = new Double(res2);
		printoutput(d1);
		
		boolean res3 = false;
		Boolean b1 = new Boolean(res3);
		printoutput(b1);
		
		char res4 = 'A';
		Character c1 = new Character(res4);
		printoutput(c1);
		
		String res5 = add("hello","world");
		printoutput(res5);
		
		StringBuffer res6 = new StringBuffer("hello");
		printoutput(res6);
		
		StringBuilder res7 = new StringBuilder("World");
		printoutput(res7);
	}

}
