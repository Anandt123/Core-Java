package Exceptionhandling;

class useraccnt
{
	private int id;				//read
	private String name;		//read
	private String pwd;			//write
	private long mob;			//read & write
	
	public useraccnt(int id, String name, String pwd, long mob) 
	{
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.mob = mob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}
	
}
class serviceaccnt
{
	private static int Id=1;
	private static useraccnt a1;
	public static useraccnt creataccnt(String un,String pwd,long mob)
	{
		a1 = new useraccnt(Id,un,pwd,mob);
		Id++;
		return a1;
	}
	
	public static void showaccnt()
	{
		System.out.println("id : "+a1.getId());
		System.out.println("name : "+a1.getName());
		System.out.println("mob : "+a1.getMob());
	}
	
	public static void updatemobno(long newmob)
	{
		System.out.println("oldmob : "+a1.getMob());
		if(newmob > 0)
		{
			a1.setMob(newmob);
		}
		else
		{
			String reason = "Mobile number cannot be negative value";
			IllegalArgumentException ref = new IllegalArgumentException(reason);
			
			throw ref;
		}
		
		System.out.println("newmob : "+a1.getMob());
	}
	
	public static void updatepwd(String newpwd)
	{
		System.out.println("updating password..");
		a1.setPwd(newpwd);
		System.out.println("password updated");
	}
	
}
public class mainclass5
{
	public static void main(String[] args) 
	{
		serviceaccnt.creataccnt("anand", "pwd123", 62644392577l);
		serviceaccnt.showaccnt();
		serviceaccnt.updatemobno(-22222222222l);
		serviceaccnt.updatepwd("pwd456");
		serviceaccnt.showaccnt();
	}
}
