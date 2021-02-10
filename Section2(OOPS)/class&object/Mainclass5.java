class Account
{
	long acntno = 1232536486l;
	String owner = "anand";
	double bal = 0.0;
	String type = "savingacc";
	String branch = "bhalki";
	static String bankname= "SBI";

	public static void showbankname()
	{
		System.out.println(bankname);
	}

	public void showbal()
	{
		System.out.println(bal);
	}

	public void showacntdetails()
	{
		System.out.println(acntno);
		System.out.println(owner);
		System.out.println(bal);
		System.out.println(type);
		System.out.println(branch);
		System.out.println(bankname);
	}

	public void deposit(double mt)						//method used to deposit the money
	{
		if(mt>0)
		{
			bal = bal + mt;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}

	public void withdraw(double mt) 						//method used to access withdraw the money
	{
		if(mt<=bal)
		{
			bal = bal - mt;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}

class Mainclass5
{
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		new Account().showbankname();
		new Account().showbal();
		System.out.println();

		Account ref1= new Account(); 						//used to create object..
		ref1.deposit(1000); 								//here we are depositing amount in ref1  
		ref1.showbal(); 									//prints the deposited balance
		System.out.println();
		ref1.withdraw(200); 								//amount will be withdrawn from same account...
		ref1.showbal();
		System.out.println(ref1);							// address should be printed 
		System.out.println();								//when we use print statement
		
		Account ref2 = ref1;
		ref2.deposit(500);
		ref2.showbal();
		System.out.println(ref2);							//for ref1 and ref2 are assigned to same object
		System.out.println();								//so value should be updated in same object...

		Account ref3= new Account();						//should need to create new object..
		ref3.deposit(1000);
		ref3.withdraw(500);
		ref3.showbal();
		System.out.println(ref3);
		System.out.println();

		System.out.println("program ends...");
	}
}
