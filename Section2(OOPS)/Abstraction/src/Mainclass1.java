interface Dao 					//Abstraction...
{
	public void create();
	public void read();
	public void update();
	public void delete();
}
class Mongodb implements Dao
{
	public Mongodb()
	{
		System.out.println("connected with mongodb server");
	}
	public void create()
	{
		System.out.println("userData is created in mongodb server");
	}
	public void read()
	{
		System.out.println("userData is readed by mongodb server");
	}
	public void update()
	{
		System.out.println("userData is updated in mongodb server");
	}
	public void delete()
	{
		System.out.println("userData is deleted in mongodb server");
	}
}
class Mysql implements Dao
{
	public Mysql()
	{
		System.out.println("connected with Mysql server");
	}
	public void create()
	{
		System.out.println("userData is created in Mysql server");
	}
	public void read()
	{
		System.out.println("userData is readed by Mysql server");
	}
	public void update()
	{
		System.out.println("userData is updated in Mysql server");
	}
	public void delete()
	{
		System.out.println("userData is deleted in Mysql server");
	}
}
class Springs
{
	public Springs()
	{
		System.out.println("you are connected with server....");
	}
	public Dao createdbobj(String type)
	{
		if(type.equalsIgnoreCase("mongodb"))
		{
			Dao  g1 = new Mongodb();
			return g1;
		}
		else
		{
			Dao g2 = new Mysql();
			return g2;
		}
	} 
}
class Mainclass1
{
	public static void main(String[] args) 
	{
		Springs s1 = new Springs();
		Dao g1 = s1.createdbobj("mongodb");
		g1.create();
		g1.read();
		g1.update();
		g1.delete();
		System.out.println();

		Dao g2 = s1.createdbobj("Mysql");
		g2.create();
		g2.read();
		g2.update();
		g2.delete();
	}
}