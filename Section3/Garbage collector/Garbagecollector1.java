package Garbagecollector;

class test
{
	int v1 = 10;
	public void sample()
	{
		System.out.println("v1 : "+v1);
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Object got deleted....");
	}
}
public class Garbagecollector1 
{
	
	@SuppressWarnings("null")
	public static void main(String[] args) 
	{
		test t1 = new test();
		t1.sample();
		
		t1 = null;
		System.gc();
		t1.sample();
		
	}

}
