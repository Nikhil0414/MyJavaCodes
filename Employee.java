import java.text.ParseException;
import java.time.*;
import java.util.*;

public class Employee 
{

	int empid;
	String name;
	float salary;
	int depcode;
	int DOJ;
	String Add;
	String Desgn;

	public void getInput() 
	{

			try (Scanner in = new Scanner(System.in)) {
				System.out.print("Enter the empid :: ");
				empid = in.nextInt();
				System.out.print("Enter the name :: ");
				name = in.next();
				System.out.print("Enter the salary :: ");
				salary = in.nextFloat();
				System.out.print("Enter the depcode :: ");
				depcode=in.nextInt();
				System.out.print("Enter the DOJ :: ");
				DOJ=in.nextInt();
				System.out.print("Enter the Add :: ");
				Add=in.next();
				System.out.print("Enter the Desgn :: ");
				Desgn=in.next();
			}
		}
	
  
	
	public void display() 
	{

		System.out.println("Employee id = " + empid);
		System.out.println("Employee name = " + name);
		System.out.println("Employee salary = " + salary);
		System.out.println("Employee depcode = " + depcode);
		System.out.println("Employee DOJ = " + DOJ);
		System.out.println("Employee Add = " + Add);
		System.out.println("Employee Desgn = " + Desgn);

	}
  
		public void age()
		{
			try (Scanner sc = new Scanner(System.in)) {
				String x=sc.nextLine();
				LocalDate pdate=LocalDate.parse(x);   
				LocalDate now = LocalDate.now();
				Period diff = Period.between(pdate, now);
				System.out.println("Age of the emp is = ");
				System.out.printf(" %d years, %d months and %d days \n\n",diff.getYears(), diff.getMonths(), diff.getDays());
			}
			
		}
	
	public static void main(String[] args) throws ParseException
	{

		Employee e[] = new Employee[5];
	

		for(int i=0; i<1; i++) 
		{

			e[i] = new Employee();
			e[i].getInput();
		}

		System.out.println(" Data Entered as below ");

		for(int i=0; i<1; i++) 
		{

			e[i].display();
		}
		
		
		Employee a=new Employee();
		 System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
		 a.age();
        	
	}
}
