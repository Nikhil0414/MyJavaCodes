import java.util.Scanner;

public class Pattern102 {

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}

/*
				System.out.print("* ");
				*
				*
				*
				*
				*
							V/S
				
				System.out.println("* ");
 				********

*/