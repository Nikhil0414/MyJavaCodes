
public class MINMAxArrr {

	public static void main(String[] args) 
	{
		int[] a= {111,2,3,4,5,6,4,5,6,7,2,8,9,0};
		int min=a[0];
		int max=a[0];
		for (int i=1;i<14;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{	min=a[i]; }
		}
		System.out.println("Min "+min);
		System.out.println("Max "+max);
		System.out.println("Nikhil");
		System.out.println("shikha");
	}

}
