import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Topic4Assignment5 {
	
	public static void main(String a[])
	{
		Set<Employee> set=new LinkedHashSet<>();
		set.add(new Employee(101,"suyash","develpoer","64648","654","594","594"));
		set.add(new Employee(102,"deepanshu","develpoer","546546","54","487","546"));
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
		
	}

}
