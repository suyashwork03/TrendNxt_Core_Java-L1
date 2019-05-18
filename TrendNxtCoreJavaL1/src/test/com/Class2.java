package test.com;
import test.Foundation;

public class Class2 {
	public static void main(String a[])
	{
		Foundation foundation=new Foundation();
		//not accessible System.out.println(foundation.Var1);
		//not accessible System.out.println(foundation.Var2);
		//not accessible System.out.println(foundation.Var3);
		System.out.println(foundation.Var4);
	}

}
