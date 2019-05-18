import java.util.*;



class Employee 
{
	int eCode;
	String name, position;
	String salary, pf, gross, tax;

	public Employee(int eCode, String name, String position, String salary, String pf, String gross, String tax) {
		super();
		this.eCode = eCode;
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.pf = pf;
		this.gross = gross;
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Employee [eCode=" + eCode + ", name=" + name + ", position=" + position + ", salary=" + salary + ", pf="
				+ pf + ", gross=" + gross + ", tax=" + tax + "]";
	}
	
	
	
	
}
class EmployeeDB 
{
	List<Employee> list=new ArrayList<>();
	
	boolean addEmployee(Employee e)
	{
		list.add(e);
		return true;
	}
	
	boolean deleteEmployee(int eCode)
	{
		
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			if(eCode==emp.eCode)
				list.remove(emp);				
		}		 
		
		return true;
	}
	String showPaySlip(int eCode)
	{
		
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			if(eCode==emp.eCode)
				return "Salary: "+emp.salary+ " PF: "+emp.pf+" Gross: "+emp.gross+" Tax: "+emp.tax;
				
		}
		return "wrong empCode";
	}
	List<Employee> listAll()
	{		
		
		return list;
	}
	
}
public class Topic4Assignment3 {
	
	
	
	public static void main(String a[])
	{
		
		EmployeeDB db=new EmployeeDB();		
		db.addEmployee(new Employee(101,"suyash","develpoer","64648","654","594","594"));
		db.addEmployee(new Employee(102,"deepanshu","develpoer","546546","54","487","546"));
		List<Employee> list=db.listAll();
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
		System.out.println("list after deletion");
		db.deleteEmployee(101);
		list=db.listAll();
		 it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
		System.out.println(db.showPaySlip(102));
		
		
	}
	
	
	

}
