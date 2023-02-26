//
//Iterative way : to rev a array
// 
//
//1) Initialize start and end indexes as start = 0, end = n-1 
//2) In a loop, swap arr[start] with arr[end] and change start and end as follows : 
//start = start +1, end = end – 1

public class IteraArrRev {
	
	 static void ArrRev (int arr[], int start, int end) 
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
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
		int arr[]= {1,2,3,4,5,6};
		printArr(arr,6);
		ArrRev(arr,0,5);
		System.out.println("After reversal");
		printArr(arr,6);
	}
}
