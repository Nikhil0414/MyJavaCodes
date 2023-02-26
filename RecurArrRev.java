import java.util.Scanner;

//Time Complexity : O(n)
//Recursive Way :
// 
//
//1) Initialize start and end indexes as start = 0, end = n-1 
//2) Swap arr[start] with arr[end] 
//3) Recursively call reverse for rest of the array.


public class RecurArrRev {
	
	 static void ArrRev (int arr[], int start, int end) 
	{
		int temp;
		if (start >= end)
            return;
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			ArrRev(arr,start+1,end-1);
			
		
	}
	
	static void printArr(int arr[], int size) 
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();  
		}
		ArrRev(arr,0,n-1);
		System.out.println("After reversal");
		printArr(arr,n);
		
	}

}

