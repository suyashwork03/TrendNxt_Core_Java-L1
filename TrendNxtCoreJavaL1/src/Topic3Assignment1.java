
import a.MyException;


public class Topic3Assignment1 {
	
	
	public static void main(String arg[]) throws MyException	{
		
		if(arg.length==0)
		{
			throw new MyException("Enter name and age as arguments.");

		}
		
		if(!(Integer.parseInt(arg[1])>=18 && Integer.parseInt(arg[1])<60))
		{
			throw new MyException("Age shoud be greater than 18 and less than 16.");
		}
		else
			System.out.println("Great");
		
	}	
	
	

}
