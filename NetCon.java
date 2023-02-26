package networking2;
import java.net.*; 
import java.util.*;

class NetCon { 
    public static void main(String args[]) 
    { 
        try { 
        	System.out.println("Enter the URL to check your connectivity (Eg:https://www.google.com) :  ");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			String url1=sc.next();
			URL url = new URL(url1);
            URLConnection connection = url.openConnection(); 
            connection.connect(); 
  
            System.out.println("Connection Successful "); 
        } 
        catch (Exception e) { 
            System.out.println("Internet Not Connected"); 
        } 
    } 
} 