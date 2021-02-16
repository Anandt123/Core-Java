class Mainclass
{
	public static void main(String[] args) 
	{
		int i1 = 85;
		char f1 =(char) i1;

		System.out.println("i1 : "+i1);
		System.out.println("f1 : "+f1);

		char f3 = 'A';
		int i3 = f3;

		System.out.println("i1 : "+i3);
		System.out.println("f1 : "+f3);

		int f2 = 2;
		long l2 =(long)f2;

		System.out.println("i2 : "+l2);
		System.out.println("f2 : "+f2);

		System.out.println(Integer.SIZE/8);
		System.out.println(Float.SIZE/8);

		
	}
}