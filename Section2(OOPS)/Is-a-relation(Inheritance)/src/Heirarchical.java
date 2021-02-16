class Heirarchical								//Here we are inheriting the properties of
{												//Savings and currentclass from Accountclass 
	public static void main(String[] args) 
	{
	Savings ref1 = new Savings();				//this is the object of child class
	System.out.println("This performs the Saving Account operation");//here we accessing the properties
	System.out.println("Account number : "+ref1.accno);				//of single parent class to one or 
	System.out.println("balance : "+ref1.bal);						//more child classes....
	System.out.println("Account holder : "+ref1.owner);
	ref1.deposit(1000);
	ref1.withdraw(1500,0);						//the two variables are amount and minbalance
	System.out.println("minimum balance : "+ref1.minbal); 
	ref1.sumofamtroi(3,5);						//variables to find rateofintrest are Rate and Time..
	System.out.println();

	Current ref2 = new Current();				//object of another child class
	System.out.println("This performs the Current Account operation");
	System.out.println("Account number : "+ref2.accno);
	System.out.println("Balance : "+ref2.bal);
	System.out.println("Account holder : "+ref2.owner);
	ref2.deposit(5000);
	ref2.withdraw(14000,1000);					//the two variables are amount and minbalance
	System.out.println("minimum balance : "+ref2.minbal);
	//ref2.showminbal(1000);
	}
}

class Account 								//this is superclass,baseclass,parentclass
{
	long accno=123456;
	double bal=10000.0;
	String owner="ak";

	public void deposit(double amt)			//method used to deposit the amount..
	{
		if(amt>0)
		{
			bal = bal + amt;
		}
		else
		{
			System.out.println("Invalid amount");
		}
	checkbal(bal);							//checking balance after amount deposition..
	}

	public void withdraw(double amt, double minbal)	//method used to withdraw amount..
	{
		if(amt<=bal&&bal-amt>=minbal)	//here when amt mustbe less then bal AND bal-amt 
		{								//should be greater then minbalance...
			bal = bal - amt;
			checkbal(bal);				//whenever above condition become true withdraw 
		}								//amt should be printed.....
		else
			if(amt>bal)					//whenever you want withdraw morethen the bal in your account
			{
				System.out.println("insufficient Balance");
			}
			else if (bal-amt<minbal) 	//you must and should have to maintain the min balance 
			{							//other you can withdraw all the amount...
				System.out.println("please maitain minbal");
			}
	}

	public static void checkbal(double bal)	//this method helps to print the check balance..
	{
		System.out.println(bal);
	}
}

class Savings extends Account 				//this is subclass,derivedclass,childclass(1)
{
	double minbal=0;						//the minbal of savings account is 0

	public void sumofamtroi(double rate, int time)//method use to find rate of intrest
	{
		double totalamt;						//to find the total amount after the 
		totalamt = bal + (bal*rate*time)/100;	//rate of intrest and show total amount
		checkbal(totalamt);
	}
}

class Current extends Account 				//this is subclass,derivedclass,childclass(1)
{
	double minbal = 1000;					//the minbal of savings account is 1000
	public void showminbal(double minbal)	//method used to check min balance...
	{
		if(bal>=minbal)
		{
			System.out.println("minbalance is maintained");
		}
		else
		{
			System.out.println("please maintain min Balance");
		}
	}
}