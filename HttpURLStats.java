package networking1;
import java.net.*;
import java.util.Scanner;   
import java.net.URL;

public class HttpURLStats
{    
	public static void main(String[] args){    
		try{    
			System.out.println ("Enter a URL");
            Scanner myInput = new Scanner(System.in);
            String input = myInput.nextLine(); 
            URL url = new URL(input);
            
			HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			for(int i=1;i<=8;i++)
			{  
				System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
			}  
			huc.disconnect();   
		}catch(Exception e){System.out.println(e);}    
	}    
}    