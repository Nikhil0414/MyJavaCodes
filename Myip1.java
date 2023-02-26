package networking1;
import java.net.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Myip1 
{
	public static void main(String[] args) throws UnknownHostException 
	{
			System.out.println("Enter a  command : ");
			Scanner sc=new Scanner(System.in);
			String x=sc.next();
			while(!x.equals("exit")) {
			if("-help".equals(x))
			{
				System.out.println("Commands : Function");
				System.out.println("  myip   : GENERATE MY SYSTEM IP & COMUTER NAME");
				System.out.println("  webip  : GENERATE HOSTNAME & IP OF URL ");
				break;
			}

			else if("myip".equals(x))
			{		
				try {	
					InetAddress  ip = InetAddress.getLocalHost();
					String  hostname = ip.getHostName();
					System.out.println("IP address : " + ip);
					System.out.println("Computer Name : " + hostname);
					InetAddress address = InetAddress.getByName("localhost");
					System.out.println(address.toString());
					break;
				}catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
			else if("webip".equals(x))
			{
				{
					System.out.println("Enter web site url");
					String s=sc.next();
					InetAddress ip=InetAddress.getByName(s);  
					System.out.println("Host Name: "+ip.getHostName());  
					System.out.println("IP Address: "+ip.getHostAddress());  
					break;
				}

			}

			else if("readpage".equals(x))
			{
				{
					String urlText = "https://www.google.com/";
				    BufferedReader in = null;
				    try {
				      URL url = new URL(urlText);
				      in = new BufferedReader(new InputStreamReader(url.openStream()));

				      String inputLine;
				      while ((inputLine = in.readLine()) != null) {
				        System.out.println(inputLine);
				      }
				    } catch (Exception e) {
				      e.printStackTrace();
				    } finally {
				      if (in != null) {
				        try {
				          in.close();
				        } catch (IOException e) {
				          e.printStackTrace();
				        }
				      }
				    }
				}

			}
			
			else 
			{
				System.out.println("Wrong Input");
				break;
			}
			
			sc.close();
		}
		System.out.println("Code Terminated");
	}
}
