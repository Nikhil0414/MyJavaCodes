
public class TimeComp1 
{
	public static void main(String[] args) 
	{
		int n=4;                         //--------------1
		int i,j;
		for(i=0;i<n;i++)                //--------------1+2n
		{
			for(j=0;j<n;j++)            //--------------1+2n * n
			{
				System.out.println("0");       //--------------n * n
			}
			System.out.println("1");          //--------------n
		}
	}
}



//         Total: 1+
//                1+2n+
//                1+2n*n+
//                n*n+
//                n
//               =3n*n+3n+1

//                3n^2    -------------- n^2