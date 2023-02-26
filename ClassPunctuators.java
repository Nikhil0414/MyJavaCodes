import java.util.Scanner;

public class ClassPunctuators
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		s1 = s1.replaceAll("\\p{Punct}",""); 
		System.out.println(s1); 
		s2 = s2.replaceAll("\\p{Punct}",""); 
		System.out.println(s2); 


	}
}
