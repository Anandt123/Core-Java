abstract class User
{
	abstract public void login();

	public void logout()
	{
		System.out.println("loged out successfully..");
	}
}
class Customer extends User
{
	@Override
	public void login()
	{
		System.out.println("customer loged in....");
	}
}
class Admin extends User
{
	@Override
	public void login()
	{
		System.out.println("Admin loged in....");
	}
}
class Mainclass2
{
	public static void main(String[] args) {
	Customer c1 = new Customer();
	c1.login();
	c1.logout();

	Admin a1 = new Admin();
	a1.login();
	a1.logout();
	}
}