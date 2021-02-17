class Sample
{
	public static void main(String[] args) 
	{
		System.out.println("program starts....");
		String name="manja";
		double marks[];
		int size=8;

		marks=new double[size];

		marks[0]=82.0;
		marks[1]=70.5;
		marks[2]=65.0;
		marks[3]=50.0;
		marks[4]=49.0;
		marks[5]=55.5;
		marks[6]=60.0;
		marks[7]=90.0;

		String branch="ECE";

		System.out.println("marks of 2nd semester:"+marks[4]);

		System.out.println("program ends....");
	}
}