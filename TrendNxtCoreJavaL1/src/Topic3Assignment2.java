import java.util.Scanner;
import a.MyException;

class Student{
	String name;
	int m1,m2,m3;
}



public class Topic3Assignment2 {
	
	public static void main(String a[]) throws MyException 
	{
		Student student1;
		Student student2;
		Scanner sc=new Scanner(System.in);
			try {
			student1=new Student();
			System.out.println("enter student name"); student1.name=sc.next();
			System.out.println("enter marks 1"); student1.m1=sc.nextInt();
			System.out.println("enter marks 2"); student1.m2=sc.nextInt();
			System.out.println("enter marks 3"); student1.m3=sc.nextInt();
			
			
			student2=new Student();
			System.out.println("enter student name"); student2.name=sc.next();
			System.out.println("enter marks 1"); student2.m1=sc.nextInt();
			System.out.println("enter marks 2"); student2.m2=sc.nextInt();
			System.out.println("enter marks 3"); student2.m3=sc.nextInt();
			}
			catch(Exception e) {
				throw new MyException("Marks shoulf be an integer");				
			}
			
			
			System.out.println("Averagw marks of "+student1.name+" is "+(student1.m1+student1.m2+student1.m3)/3);
			System.out.println("Averagw marks of "+student2.name+" is "+(student2.m1+student2.m2+student2.m3)/3);

	}

}
