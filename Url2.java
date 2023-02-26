package networking1;
import java.io.*;
import java.net.*;  
import java.util.*;

public class Url2

{ 	public static void main(String[] args) throws IOException {

		boolean urlValid = false;
		URL url = null;
		while(!urlValid) {

			try {
				System.out.println("Enter the URL : ");
				Scanner sc=new Scanner(System.in);
				String url1=sc.next();
				url = new URL(url1);
				
				urlValid = true;
				System.out.println("The url was valid");
			} catch (MalformedURLException e) {
				System.out.println("The url was invalid, please try again");
			}
		}

		//continue processing
		System.out.println("The url entered was: "+url.toString());

		System.out.println("Protocol: "+url.getProtocol());    
		System.out.println("Host Name: "+url.getHost());    
		System.out.println("Port Number: "+url.getPort());    
		System.out.println("Default Port Number: "+url.getDefaultPort());    
		System.out.println("Query String: "+url.getQuery());    
		System.out.println("Path: "+url.getPath());    
		System.out.println("File: "+url.getFile()); 

		HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
		for(int i=1;i<=8;i++){  
			System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
		}  
		huc.disconnect();    

	}
}
