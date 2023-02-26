
public class TimeComp22
{
	public static void main(String[] args) 
	{
		int n=4;                         //--------------1
		int i,sum=0;
		int a[] = {1,2,3,4,5,6,7};
		for(i=0;i<n;i++)                //--------------1+2n
			
			sum=sum+a[i];          //--------------2n	

			System.out.println(sum);   //--------------1
		
	}
}



//         Total: 1+
//                1+2n+
//                2n+
//                1
//               =4n+1

//                4n    --------------   n  