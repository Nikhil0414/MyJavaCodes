package Sorting;

public class BubbleSORT {

	public static void swap(int a[],int i,int j)
	{
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		//----------------------------------------//
		System.out.println("\nTo show the whole sorting process -->\n");
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		//---------------------------------------//
	}

	public static void main(String[] args) {
		int[] a= {55,99,2,7,223,65,90};
		for(int i=0;i<a.length;i++)
		{ 
			boolean swapped=false;

			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j+1]<a[j])
				{
					swapped=true;
					swap(a,j+1,j);
				}
			}
			if(!swapped)
			{
				break;
			}
		}
		System.out.println("\n\nFinally the sorted result-->");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}