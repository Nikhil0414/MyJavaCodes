package Searching;

//Ordered VS Unordered

public class LinearSEARCH {

	public static int linearSearch(int[] arr, int key)
	{    
		for(int i=0;i<arr.length;i++)
		{    
			if(arr[i] == key)
			{    
				return i;    
			}   
			
			//For Ordered:--
			
			else
				if(arr[i] > key)
				{    
					return -1;    
				}   
			//End
		}    
		return -1;    
	}    
	public static void main(String a[])
	{    
		int[] a1= {110,320,130,50,700,90};    
		int key = 30;    
		System.out.println(key+" is found at index: "+linearSearch(a1, key));    
	}    
}    