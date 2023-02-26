//
//public class FunArrRev {
//
//	public static void Rev(int a[])
//	{
//		for(int i=4;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
//	}
//
//	public static void main(String[] args) 
//	{
//		int[] b= {1,2,3,4,5};
//		Rev(b);
//	}
//}

//Time complexity:
//Space Complexity:

import java.util.*;
public class FunArrRev {

	public static void Rev(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] b=new int[n];
		
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		Rev(b);
	}
}

