class switchcase
{
	public int caughtSpeeding(int speed, boolean isBirthday) {
 	if (speed <= 60 && isBirthday false)||(speed <= 65 && isBirthday true)
  		{
    		return 0;
  		}
  	else if(speed <= 80 && speed >= 61 && isBirthday false)||(speed <= 85 && speed >= 66 && isBirthday true)
  		{
    		return 1;
  		}
  	else
  		{
    		return 2;
  		}

		return;
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts...");

		caughtSpeeding(60,false);
		System.out.println("program ends...");	
	}
}