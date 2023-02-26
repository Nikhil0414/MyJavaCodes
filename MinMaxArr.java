//
//public class MinMaxArr {
//
//	public static void main(String[] args) {
//
//		int[] a= {1,2,3,4,5,6,4,5,6,7};
//		int i,j,max1,max2;
//		for(i=0;i<9;i++)
//		{
//			if(a[i]>a[i+1])
//			{
//				max1=a[i];
//				System.out.println("Max "+max1);
//			}
//			else
//			{
//				System.out.println("  ");
//			}
//		}
//		for(i=9;i>=0;i--)
//		{
//			if(a[i]>a[i+1])
//			{
//				max2=a[i];
//				System.out.println("Max "+max2);
//			}
//			else
//			{
//				System.out.println("  ");
//			}
//		}
//
//	}
//}





public class MinMaxArr {

	public static void main(String[] args) {

		int[] a= {111,12,13,15,16,14,5,6,7,2,8,9,10,44};
		int i,max=a[0],min=a[0];
		for(i=0;i<14;i++)
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
