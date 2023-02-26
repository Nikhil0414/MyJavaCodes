
public class ArrRev {
	
	     public static void reverseArr( int[] arr, int start, int end ){
	        while( start<end ){
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	                end--; start++;
	        }
	    }
	    	    
	    public static void main(String args[]) {
	         
	        int arr[] = {1, 2, 3, 4, 5, 6};
	        reverseArr(arr, 0, 5);
	        System.out.print("Reversed array is \n");
	        for (int i = 0; i < arr.length; i++)
	             System.out.print(arr[i] + " ");
	}
}

