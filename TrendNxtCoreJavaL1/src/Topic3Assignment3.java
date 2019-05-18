import a.MyException;

public class Topic3Assignment3 {
	
	public static void main(String args[]) throws MyException
	{
		if(args.length!=5)
		{
			throw new MyException("number of arguments should be 5");
		}
		int avg=(Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]))/5;
		System.out.println("Average is "+avg);
	}

}
