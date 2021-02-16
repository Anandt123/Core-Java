class Image 
{
	double size;

	public Image(double size)
	{
		this.size=size;
	}
	public void getsize()
	{
		System.out.println("Image size is : "+size);
	}
}
class Video 
{
	double duration;
	public Video(double duration)
	{
		this.duration=duration;
	}
	public void getduration()
	{
		System.out.println("video duration is : "+duration);
	}
}
class Server
{
	public void upload(Object obj)
	{
		if(obj instanceof Image)
		{
			Image img = (Image)obj;
			img.getsize();
		}
		else
		{
			Video vid = (Video)obj;
			vid.getduration();
		}
	}
}
class Instagram
{
	public static void main(String[] args) 
	{
		Server s1 = new Server();
		Image i1 = new Image(1.2);
		Video v1 = new Video(2.1);
		s1.upload(i1);
		s1.upload(v1);
	}
}