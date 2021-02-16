class Graphsheet
{
	public void drawpoint()
	{
		System.out.println("drawpoint at 0,0");
	}
	public static void drawpoint(int a,int b)
	{
		System.out.println("drawpoint at "+a+","+b);
	}
	
	public int drawpoint(double a,double b)
	{
		System.out.println("drawpoint at "+4.0+","+5.0);
		return 10;
	}
	public void drawpoint(double a,int b)
	{
		System.out.println("drawpoint at "+5.0+","+6);
	}
	public void drawpoint(int a,double b)
	{
		System.out.println("drawpoint at "+6+","+7.0);
	}
}
class Moverloding					//(overloading)of methods is performed here...
{									//means methods with same name are also parformed..
	public static void main(String[] args) 
	{
		Graphsheet a1 = new Graphsheet();
		a1.drawpoint();
		a1.drawpoint(3,4);
		a1.drawpoint(4.0,5.0);
		a1.drawpoint(5.0,6);
		a1.drawpoint(6,7.0);
		
	}
}