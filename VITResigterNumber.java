import java.util.Scanner;

public class VITResigterNumber 
{
	static void readRegNo() 
	{
		System.out.println("Enter Reg No ");
		
	}
		static void validateRegNo() 
		{
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			int x=s1.length();
			if(x==9) 
			{
				System.out.println("Valid RegNo");
			}
			else
			{
				System.out.println("Invalid RegNo");
			}
		try {   if (x==10) {
		        System.out.println("good");
		    }
		} catch (WrongYearException err) {
		        throw new WrongYearException (
		          "Incorrect filename : ", err);
		    }
		}
		
	public static void main(String[] args) {
		readRegNo();
		validateRegNo();
		
	}
}

