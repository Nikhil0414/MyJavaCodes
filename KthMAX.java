import java.util.*;
public class KthMAX {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a= {111,12,13,15,16,14,5,6,7,2,8,9,10,44};
		int i,max=a[0],min=a[0];
		int n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				System.out.println("Max "+max);

			}
			if(a[i]<min)
			{
				min=a[i];
				System.out.println("Min "+min);

			}
		}
		System.out.println("Max "+max);
		System.out.println("Min "+min);
	}

}
