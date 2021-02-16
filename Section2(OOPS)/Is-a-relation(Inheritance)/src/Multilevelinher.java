class Multilevelinher					//the subclass inheriting properties of superclass and
{										//superclass inheriting properties of another superclass

	public static void main(String[] args) 
	{
		Whatsupv3 ref1 = new Whatsupv3();//object of subclass,childclass
		ref1.sendmsg();
		ref1.sendvoicemsg();
		ref1.videocall();
		System.out.println();

		Whatsupv2 ref2 = new Whatsupv2();//object of superclass,parent class
		ref2.sendmsg();
		ref2.sendvoicemsg();
		System.out.println();

		Whatsupv1 ref3 = new Whatsupv1();//object of another superclass,parent class
		ref3.sendmsg();
	}
}

class Whatsupv1
{
	public void sendmsg()				//from this method you only send the msg 
	{
		System.out.println("this is a sendmsg() method of Whatsupv1 class");
	}
}

class Whatsupv2 extends Whatsupv1
{
	public void sendvoicemsg()			//here we are inheriting the whatsupv1(superclass)
	{									//from this we can access both sendmsg and voicemsg
		System.out.println("this is a sendvoicemsg() method of Whatsupv2 class");
	}
}

class Whatsupv3 extends Whatsupv2
{										//here we are inheriting the whatsupv2(subclass)
	public void videocall()				//from this we can perform all the operations
	{									//like sendmsg,sendvoicemsg and videocall
		System.out.println("this is a videocall() method of Whatsupv3 class");
	}
}