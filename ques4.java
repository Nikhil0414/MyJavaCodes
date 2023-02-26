
public class ques4
{
	public static void sort012(int a[], int n)
	{
		int i,c1=0,c2=0,c0=0;

		for(i=0;i<n;i++)
		{
			if(a[i]==0)
				c0++;
			else if(a[i]==1)
				c1++;
			else if(a[i]==2)
				c2++;
		}

		for(i=0;i<n;i++)
		{
			if(c0>0)
			{
				a[i]=0;
				c0--;
			}
			else if(c1>0)
			{
				a[i]=1;
				c1--;
			}
			else if(c2>0)
			{
				a[i]=2;
				c2--;
			}
		}
	}

	public static void main(String[] args) {
		int n=9;
		int[] a = new int[]{1,2,0,0,1,1,2,2,2}; 
		sort012(a,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}

