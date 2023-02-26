// { Driver Code Starts
//Initial Template for Java

import java.util.*;
public class ques6 {

	static int doUnion(int a[], int n, int b[], int m) 
		{
			Set<Integer> ss = new HashSet<>();
			for(int i=0;i<n;i++)
			{
				ss.add(a[i]);
			}
			for(int j=0;j<m;j++)
			{
				ss.add(b[j]);
			}
			int g = ss.size();
			return g;
		}

	public static void main (String[] args) {

		//Taking input using class Scanner
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		//Taking total count of testcases
		System.out.println("t=");

		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{

			int n,m;

			//taking size of array a
			System.out.println("n=");
			n=sc.nextInt();

			//taking size of array b
			System.out.println("m=");
			m=sc.nextInt();

			//Creating 2 array of size n and m
			int a[]=new int[n];
			int b[]=new int[m];

			//inserting elements to array a
			System.out.println("a[]=");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}

			//inserting elements to array b
			System.out.println("b[]=");
			for(int i=0;i<m;i++)
			{
				b[i]=sc.nextInt();
			}
			System.out.println(doUnion(a,n,b,m));
		}

	}
}


