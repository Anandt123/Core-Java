class Account
{
	
	double bal=0.0;
	
	public void deposit(double mt)
	{
		bal=bal+mt;
	}

	public void withdraw(double mt)
	{
		bal=bal-mt;
	}
	public void showbal()
	{
		System.out.println(bal);
	}
}
	class Account1
	{

	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		
		Account ref=new Account();
		
		ref.deposit(1000);
		ref.showbal();

		System.out.println("program ends...");
	}
}
