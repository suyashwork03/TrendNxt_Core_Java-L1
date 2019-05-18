
class A
{ 
	protected void finalize()
	{
		System.out.println("Finalize method called");
		
	}
}

public class Topic4Assignment6 {
	
	public static void main(String args[])
	{
		A a=new A();
		a=new A();
		a=new A();
		Runtime.getRuntime().gc();
		
	}

}
