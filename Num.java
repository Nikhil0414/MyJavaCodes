import java.util.Scanner;
public class Num 
{
	public static void main(String arg[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			System.out.println("NUM = "+a);
			int b=(a+7)%10;
			int c=a/10;
			int d=(c+7)%10;
			int e=c/10;
			int f=(e+7)%10;
			int g=e/10;
			int h=(g+7)%10;
			
			System.out.println(b);
			System.out.println(d);
			System.out.println(f);
			System.out.println(h);
			
			System.out.println(h+""+f+""+d+""+b);
			
			System.out.println("Encrypted NUM = ");
			System.out.println(d+""+b+""+h+""+f);
			System.out.println("Start Decrypeting NUM ");
			System.out.println(h+""+f+""+d+""+b);
		}
		
		
		
		
		
		
		
		
}
}