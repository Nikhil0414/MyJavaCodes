import java.util.Scanner;

class ca1 {
	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("Satyajeet");

		System.out.println("Before removal String = "+ str.toString());

		StringBuilder afterRemoval = str.delete(0, 5);

		System.out.println("After removal String = "+ afterRemoval.toString());

		try (Scanner sc = new Scanner (System.in)) {
			int x=sc.nextInt();
			System.out.println("The int value is = "+x);
		}

	}
}