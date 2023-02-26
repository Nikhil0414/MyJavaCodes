
public class TimeComp3
{
	public static void main(String[] args) 
	{
		int n=64;                         //--------------1
		int i;
		for(i=n;i>0;i=i/2)  // or (i=0;i<=n;i=i*2)      //--------------1+2^k
		{
			System.out.println(i);          //--------------k
		}
	}
}


//         Total: 1+
//                1+2^k+
//                k
//               =2^k+k+2

//                2^k    -------------- log n



// NOTE : here 2 is c (constant) k(1,2,3,4,5....) is variable like n(1,2,3,4...)

//for (int i = 1; i <=n; i *= c) {
//    // some O(1) expressions
//}
//for (int i = n; i > 0; i /= c) {
//    // some O(1) expressions
//}