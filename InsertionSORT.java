package Sorting;

public class InsertionSORT {

	public static void main(String[] args) {

		int a[]= {76,4,45,335,43,22,10};
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
				
				//----------------------------------//
				System.out.println("\nFor the Process");
				for(int x=0;x<a.length;x++)
				{
					System.out.println(a[x]);
				}
				//----------------------------------//
			}
			a[j+1]=temp;
		}

		System.out.println("\n\nFinal result----------------->");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
