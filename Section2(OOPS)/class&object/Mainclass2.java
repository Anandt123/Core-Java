class Account
{
	
	double bal=0.0;
	
	public  void deposit(double mt)
	{
		bal=bal+mt;
	}

	public  void withdraw(double mt)
	{
		bal=bal-mt;
	}
	public void showbal()
	{
		System.out.println(bal);
	}


class sach
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		
		Account a1= new Account();
		a1.deposit(1000);
		a1.showbal();

		System.out.println("program ends...");
	}
}
}