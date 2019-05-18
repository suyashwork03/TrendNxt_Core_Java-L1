import java.util.HashMap;
import java.util.Scanner;

class Service
{
	public HashMap<String,Long> hm=new HashMap<>();
	
	
	
}
public class Topic4Assignment4 {
	
	public static void main(String a[])
	{
		Service service=new Service();
		service.hm.put("airtel", 48164885l);
		service.hm.put("idea", 48975748l);
		service.hm.put("vodafone", 64648651l);
		service.hm.put("jio", 814854815l);
		service.hm.put("rcom", 985589864l);
		
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("Number corresponding to "+name+" is "+service.hm.get(name));
		
	}
	

}
