interface Run
{
	public int findavg(double n1,double n2);
	public double findsum(int a1,int a2);
}

class Sample implements Run
{
	@Override
	public int findavg(double n1,double n2)
	{
		double sum = n1+n2;
		int avg = (int)(sum/2);//narrowing
		return avg;
	}
	@Override
	public double findsum(int a1,int a2)
	{
		int sum = a1+a2;//widening
		return sum;
		/*double sum = (double)(n1+n2)
		*/
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		System.out.println(s1.findavg(12.11,4.33));
		System.out.println(s1.findsum(2,3));
	}	
}