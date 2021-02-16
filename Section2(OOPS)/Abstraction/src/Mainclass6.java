interface User
{
	public void login();
}
class Webuser implements User
{
	public void login()
	{
		System.out.println("loged in through website");
	}
}
class Mobileuser implements User
{
	public void login()
	{
		System.out.println("loged in through Mobile");
	}
}

class Spring
{
	public User createuserobj(String type)
	{
		if(type.equalsIgnoreCase("web"))
		{
			User u1 = new Webuser();
			return u1;
		}
		else
		{
			User u2 = new Mobileuser();
			return u2;
		}
	}
}
class Mainclass6
{
	public static void main(String[] args) 
	{
		Spring sp = new Spring();
		User u1 = sp.createuserobj("web");
		u1.login();

		User u2 = sp.createuserobj("Mobile");
		u2.login();
	}
}