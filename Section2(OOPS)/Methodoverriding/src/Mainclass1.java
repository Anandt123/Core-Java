class Post
{
	public void like()
	{
		System.out.println("somebody liked your Post");
	}
	public static void comment()
	{
		System.out.println("somebody commented on your Post");
	}
	public void share()
	{
		System.out.println("anyone can share your Post");
	}
	public void save()
	{
		System.out.println("anyone can save your Post");
	}
}
class Pic extends Post 	//class extending all properties from post class 
{											//and also overriding all the properties 
	@Override 								//from editpic interface
	public static void comment()
	{
		System.out.println("you can add comment to your image");
	}
									//from editpic interface
	public void subscribe()
	{
		System.out.println("you can add save to your image");
	}
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		Pic p1 = new Pic();
		p1.comment();
		p1.subscribe();
	}
}