import java.util.Scanner;

public class New
{

	public static void main(String []args)
	{

		try (Scanner sc = new Scanner(System.in)) {
			int[] array=new int[10];

			for(int i=0;i<array.length;i++)
			{

				System.out.println("Enter the "+(i+1)+" number");

				array[i]=sc.nextInt();
			}
		}
	}

}