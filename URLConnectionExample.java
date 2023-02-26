package networking1;
import java.io.*;  
import java.net.*;  
import java.util.Scanner;

public class URLConnectionExample {  
	public static void main(String[] args){  
		try{  
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the URL : ");
			String url1=sc.next();
				URL url = new URL(url1);
			URLConnection urlcon=url.openConnection();  
			InputStream stream=urlcon.getInputStream();  
			int i;  
			while((i=stream.read())!=-1){  
				System.out.print((char)i);  
			}  
		}catch(Exception e){System.out.println(e);}  
	}  
} 