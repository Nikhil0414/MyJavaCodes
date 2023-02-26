import java.util.NoSuchElementException;
import java.util.Scanner;

public class Newlab4 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Reg  No:");
			String x = s.next();
			System.out.println("Mobile No:");
			String y = s.next();
			
			char[] a = x.toCharArray();
			char[] b = y.toCharArray();

			for(int i=0;i<b.length;i++)
			{
				if(!Character.isDigit(b[i]))
				{
					throw new NumberFormatException();
				}
			}
			for(int i=0;i<a.length;i++)
			{
				if(!Character.isDigit(a[i]) && !Character.isLetter(a[i]))
				{
					throw new NoSuchElementException();
				}
			}
			if(a.length!=9 || b.length!=10)
			{
				throw new IllegalArgumentException();
			}

			System.out.println("Valid");
		}

		catch(NumberFormatException err)
		{
			System.out.println("Invalid");
		}

		catch(IllegalArgumentException err)
		{
			System.out.println("Invalid");
		}

		catch(NoSuchElementException err)
		{
			System.out.println("Invalid");
		}

	}

}