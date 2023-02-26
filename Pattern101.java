import java.util.Scanner;

/*

public class Pattern101 {

    public static void main(String args[]) {

        System.out.print("Reversed array is");
        System.out.println();

}
}

 */

public class Pattern101 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print("* ");
				j=j+1;
			}
			System.out.print("\n");
			i=i+1;
		}
	}
}
