import java.util.Scanner;

public class MyPattern01 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if (i%2==0)
			{
				for(int j=1;j<n/2;j++)
				{
					System.out.print("  ");
				}

				System.out.print("* \n");
			}
			else
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.print("\n");
			}
		}
	}
}
