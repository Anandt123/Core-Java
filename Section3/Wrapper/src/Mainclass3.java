package wrapper;

public class Mainclass3 {

	public static void main(String[] args) 
	{
		int x1 = 123;
	    Integer i1 = x1;
	    System.out.println("Integer without new keyword : "+i1);
	      
	    Object obj1 = new String("hello");
	    Object obj2 = "hello";
	    System.out.println("String with new keyword"+obj1);
	    System.out.println("String without new keyword"+obj2);
	    /* 1.Create the object of String class
	     * 2.Assign the address of String class object to
	     *   Object class ref var and perform Upcasting */
	      
	    Object obj3 = new Integer(10);
	    System.out.println("Object obj3 Integer of Wrapper class : "+obj3);
	    Integer i2 = 10;//Autoboxing
	    System.out.println("Autoboxing int : "+i2);
	    Object obj4 = i2;//Upcasting
	    System.out.println("upcasting the Autoboxing int : "+obj4);
	      
	    Object obj5 = 123;
	    System.out.println("Object obj5 : "+obj5);
	    /* If u try to assign primitive value to Object class ref var
	     * then, JVM
	     * 1.Create the object of corresponding wrapper class
	     * 2.Assign the address of wrapper class object to
	     *   Object class ref var and perform Upcasting */
	}

}
