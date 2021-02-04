class Transacation 									//example for has a relation....
{
	int transacationid;
	String date;
	String type;
	double amount;
	double postbal;

	public void showTransacation()
	{
		System.out.println("transaction id : "+transacationid);
		System.out.println("date : "+date);
		System.out.println("type : "+type);
		System.out.println("amount : "+amount);
		System.out.println("postbal : "+postbal);
	}
}

class Account1
{
	long accountno;
	double bal;
	Transacation t1 = new Transacation();

	public void deposit(int amt)
	{
		if(amt>0)
		{
			bal=bal+amt;

			t1.transacationid = 11232;
			t1.date ="9-jan-2021";
			t1.type ="deposit";
			t1.amount = amt;
			t1.postbal = bal;
		}
	}
	public void withdraw(int amt)
	{
		if(amt<=bal)
		{
			bal=bal-amt;

			t1.transacationid = 11231;
			t1.date ="9-jan-2021";
			t1.type ="withdraw";
			t1.amount = amt;
			t1.postbal = bal;
		}
	}
	public void showbalance()
	{
		System.out.println(bal);
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		Account1 a1=new Account1();
		a1.deposit(500);
		a1.t1.showTransacation();
		a1.withdraw(200);
		a1.t1.showTransacation();
		System.out.println();

		Account1 a2=new Account1();
		a2.deposit(5000);
		a2.t1.showTransacation();
	}
}