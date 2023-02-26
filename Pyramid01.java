import java.util.Scanner;

public class Pyramid01 {

	public static void main(String[] args) {

		int n,i,j;
		System.out.print("How many rows you want in your pyramid?\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();

		for (i=1;i<=n;i++)
		{
			for(j=1;j<=2*n;j++)
			{
				if(j >= n-(i-1) && j <= n+(i-1))
					System.out.print("*") ;
				else
					System.out.print(" ") ;
			}
			System.out.print("\n");
		}
	}
}
