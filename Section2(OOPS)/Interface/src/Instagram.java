class Post
{
	public void like()
	{
		System.out.println("somebody liked your Post");
	}
	public void comment()
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

interface Editpic						//interface method contains the picedit options
{
	public void filter();
}

interface Editvideo						//interface method contains the videoedit options
{
	public void mutevideo();
}

class Pic extends Post implements Editpic	//class extending all properties from post class 
{											//and also overriding all the properties 
	@Override 								//from editpic interface
	public void filter()
	{
		System.out.println("you can add filter to your image");
	}
}

class Video extends Post implements Editvideo//class extending all properties from post class 
{											//and also overriding all the properties 
	@Override 								//from editpic interface
	public void mutevideo()
	{
		System.out.println("you can mute audio from your Video");
	}
}

class Instagram
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts....");	
		System.out.println("This is all about picture in Instagram");
		Pic p1 = new Pic();			//from this object we can access all the methods of 
		p1.like();					//postclass and implements the editpic interface also..
		p1.comment();
		p1.share();
		p1.save();
		p1.filter();

		System.out.println();
		System.out.println("This is all about video in Instagram");
		Video v1 = new Video();		//from this object we can access all methods of 
		v1.like();					//postclass and implements the editvideo interface also...
		v1.comment();
		v1.share();
		v1.save();
		v1.mutevideo();
		System.out.println("Program ends.....");
	}
}